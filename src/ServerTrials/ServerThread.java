package ServerTrials;


import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class ServerThread extends Thread implements Closeable{
	Socket socket;
	boolean p = true;
	ServerThread(Socket socket){
		this.socket = socket;
	}
	public void run(){
		try{
			String m = null;
			BufferedReader bR = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(p){
				if(bR.ready()){
					m = bR.readLine();
					System.out.println("incoming client message: " + m);
				}
			}
			//bR.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	@Override
	public void close(){
		p= false;
	}
}