package ServerTrials;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTrial{

	private volatile static Socket socket;
	private boolean open;
	private final String ip="10.33.5.248";//TODO
	private final int port=36660;
	private String name;
	public ClientTrial() throws UnknownHostException, IOException{
		socket = new Socket(ip, port);
		name = socket.getInetAddress().toString();
		open = true;
	}

	public void write(String message){	
		try
		{
			BufferedReader bR = new BufferedReader(new StringReader(message));
			PrintWriter pR = new PrintWriter(socket.getOutputStream());
		//	while(open){
				String input = bR.readLine();
				System.out.println(name + ": " + input);
				pR.println(name + ": " + input);
				pR.flush();
	//		}
		}catch(IOException e) {e.printStackTrace(); }


	}
	public String read(){
		try {
			BufferedReader bR = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			if(bR.ready()){
				return bR.readLine();
			}
			else return null;
				
				
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		
		
		
	}





}


