package ServerTrials;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import java.net.UnknownHostException;

public class ClientTrial{
	
	
	public static void main(String args[]) throws UnknownHostException, IOException{
		Socket socket = new Socket("10.33.5.248", 36660);
		String name = socket.getInetAddress().toString();
		BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pR = new PrintWriter(socket.getOutputStream());
		while(true){
			String input = bR.readLine();
			System.out.println(name + ": " + input);
			pR.println(name + ": " + input);
			pR.flush();
		}
	}
}

