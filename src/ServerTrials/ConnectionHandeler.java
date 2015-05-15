package ServerTrials;


import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JFrame;


public class ConnectionHandeler extends Thread implements Closeable{
	Socket socket;
	boolean p = true;
	ConnectionHandeler(Socket socket){
		this.socket = socket;
	}
	public void run(){
		try{
			String m = null;
			BufferedReader bR = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(p){
				if(bR.ready()){
					m = bR.readLine();
					System.out.println("Client : " + socket.getInetAddress() + " Message: " + m);
					if(m.equals(JFrame.EXIT_ON_CLOSE)){
						bR.close();
						this.close();
					}
				}

					
			}
			}catch(IOException e){	e.printStackTrace();	}
	}
	@Override
	public void close(){
		p= false;
	}
}