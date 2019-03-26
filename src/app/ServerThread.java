package app;

import com.google.gson.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author dzimiks
 * Date: 26-03-2019 at 11:52
 */
public class ServerThread implements Runnable {

    private Socket socket;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;

    private BufferedReader quoteBufferedReader;
    private PrintWriter quotePrintWriter;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private List<String> jsonQuotes = new ArrayList<>();
    private Random random = new Random();

    public ServerThread(Socket socket) throws IOException {
        this.socket = socket;
        this.printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        Socket quoteSocket = new Socket("quotes.rest", 80);
        this.quoteBufferedReader = new BufferedReader(new InputStreamReader(quoteSocket.getInputStream()));
        this.quotePrintWriter = new PrintWriter(new OutputStreamWriter(quoteSocket.getOutputStream()));

        this.jsonQuotes.add(Constants.LOCAL_QUOTE_1);
        this.jsonQuotes.add(Constants.LOCAL_QUOTE_2);
        this.jsonQuotes.add(Constants.PRINCESS_DIANA_LOCAL_QUOTE);
    }

    @Override
    public void run() {
        try {
            String line = bufferedReader.readLine();

            while (line != null && !line.equals("")) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            String response = Constants.RESPONSE + Constants.NEW_LINE_END;
            response += Constants.PRE_HTML + "<style>"
                    + Constants.STYLE + "</style></head><body>"
                    + Constants.LOADER_HTML
                    + getQuote()
                    + Constants.LOADER_SCRIPT + "</body></html>";

            printWriter.println(response);
            bufferedReader.close();
            printWriter.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getQuote() throws IOException {
        quotePrintWriter.write("GET /qod HTTP/1.0"
                + Constants.NEW_LINE + "Host: quotes.rest"
                + Constants.NEW_LINE + "Accept: json"
                + Constants.NEW_LINE_END);
        quotePrintWriter.flush();

        StringBuilder sb = new StringBuilder();
        String line = quoteBufferedReader.readLine();
        boolean content = false;

        while (line != null) {
            if (line.equals("")) {
                content = true;
            }

            if (content) {
                sb.append(line);
            }

            line = quoteBufferedReader.readLine();
        }

        String json = sb.toString();
        return parseJson(json);
    }

    private String parseJson(String json) {
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        JsonObject contents;
        JsonArray quotes;

        System.out.println(json);

        try {
            contents = jsonObject.getAsJsonObject("contents");
            quotes = contents.getAsJsonArray("quotes");
        } catch (NullPointerException e) {
            json = jsonQuotes.get(random.nextInt(jsonQuotes.size()));
            jsonObject = gson.fromJson(json, JsonObject.class);
            contents = jsonObject.getAsJsonObject("contents");
            quotes = contents.getAsJsonArray("quotes");
        }

        JsonElement latestQuote = quotes.get(0);
        JsonObject object = latestQuote.getAsJsonObject();
        String quote = object.get("quote").getAsString();
        String author = object.get("author").getAsString();
        String date = object.get("date").getAsString();
        JsonArray tagsArray = object.getAsJsonArray("tags");
        String tags = tagsArray.toString()
                .replace("[", "")
                .replace("]", "")
                .replace("\"", "")
                .replace(",", ", ");

        return "<div class=\"quote\"><div class=\"blockquote-wrapper\"><div class=\"blockquote\"><h1>"
                + quote + "</h1><h4>"
                + author + "</h4><p class=\"text-muted\">"
                + tags + "</p><p class=\"text-muted\">"
                + date + "</p>"
                + "</div></div></div>";
    }
}
