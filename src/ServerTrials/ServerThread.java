package ServerTrials;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class ServerThread extends Thread {
	Socket socket;
	ServerThread(Socket socket){
		this.socket = socket;
	}
	public void run(){
		try{
			String m = null;
			BufferedReader bR = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while((m = bR.readLine()) != null)
				System.out.println("incoming client message: " + m);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
