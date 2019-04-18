package app;

import java.net.ServerSocket;
import java.net.Socket;


/**
 * @author dzimiks
 * Date: 26-03-2019 at 10:07
 */
public class MainServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(Constants.PORT);
			System.out.println("Server is running on port " + Constants.PORT);

			while (true) {
				Socket socket = serverSocket.accept();
				ServerThread serverThread = new ServerThread(socket);
				new Thread(serverThread).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
