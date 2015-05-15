package ServerTrials;

import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.sun.glass.events.WindowEvent;

public class ClientMessenger{
	
	/**@param serverIP = IP of the Computer running the Server
	 * 
	 */
	private final static String serverIP =  "10.33.5.248";
	public ClientMessenger() throws UnknownHostException, IOException{
		Socket socket = new Socket(serverIP, 36660);
		String name = socket.getInetAddress().toString();
		BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pR = new PrintWriter(socket.getOutputStream());
		while(true && !bR.readLine().equals(WindowEvent.CLOSE)){
			String input = bR.readLine();
			System.out.println(name + ": " + input);
			pR.println(name + ": " + input);
			pR.flush();
		}
		socket.close();
		
		/*
		addWindowListener(new WindowAdapter()
	        {
	            @Override
	            public void windowClosing(WindowEvent e)
	            {
	                System.out.println("Closed");
	                e.getWindow().dispose();
	            }
	        });*/
	}
}

