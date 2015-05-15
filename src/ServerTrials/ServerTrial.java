package ServerTrials;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerTrial {
		public static final int PORT = 36660;
		
		public static void main(String args[])throws IOException{
			new ServerTrial().runServer();
		}
		public void runServer() throws IOException{
			ServerSocket socket = new ServerSocket(PORT);
			socket.setSoTimeout(1000);
			ServerAccept acc = new ServerAccept(socket);
			acc.start();
		}
		
		public void sendMessage(){
			
			
			
		}
		
		
	}