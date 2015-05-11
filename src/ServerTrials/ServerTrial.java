package ServerTrials;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerTrial {
		final int PORT = 6588;
		public static void main(String args[])throws IOException{
			new ServerTrial().runServer();
		}
		public void runServer() throws IOException{
			ServerSocket socket = new ServerSocket(PORT);
			while(true){
				Socket socket2 = socket.accept();
				new ServerThread(socket2).start();

			}
		}
	}

