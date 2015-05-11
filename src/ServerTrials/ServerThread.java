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

	public ServerThread() {
		// TODO Auto-generated constructor stub
	}

	public ServerThread(Runnable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ServerThread(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ServerThread(ThreadGroup arg0, Runnable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ServerThread(ThreadGroup arg0, String arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ServerThread(Runnable arg0, String arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ServerThread(ThreadGroup arg0, Runnable arg1, String arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	public ServerThread(ThreadGroup arg0, Runnable arg1, String arg2, long arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
