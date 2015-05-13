package ServerTrials;

import java.io.Closeable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;


public class ServerAccept extends Thread implements Closeable{
	private ServerSocket socket;
	public ServerAccept(ServerSocket s){
		socket = s;
	}
	boolean p = true;
	
	public void run(){
		
		while(p){
			Socket socket2;
			try {
				socket2 = socket.accept();
				new ServerThread(socket2).start();
			}
			catch (SocketTimeoutException e) {} 
			catch (IOException e) {e.printStackTrace();}
		
		
		}
	}
	
	
	
	
	@Override
	public void close(){
		p = false;
		
	}
	
	
	
	
	
	
	
	
}
