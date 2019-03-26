package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author dzimiks
 * Date: 26-03-2019 at 11:52
 */
public class ServerThread implements Runnable {

    private Socket socket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;

    public ServerThread(Socket socket) throws IOException {
        this.socket = socket;
        this.printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void run() {
        try {
            String line = bufferedReader.readLine();

            while (line != null && !line.equals("")) {
                System.out.println("LINE: " + line);
                line = bufferedReader.readLine();
            }

            // TODO
            String response = Constants.RESPONSE + Constants.NEW_LINE_x2;
            System.out.println("RESPONSE: " + response);

            response += "<html><head><title>TEST</title></head><body><h1>TEST HEADING</h1></body></html>";

            printWriter.println(response);
            bufferedReader.close();
            printWriter.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
