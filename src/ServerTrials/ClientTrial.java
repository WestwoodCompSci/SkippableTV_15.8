package ServerTrials;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.*;

public class ClientTrial {
	
	public static void main(String args[]) throws UnknownHostException, IOException {
		JFrame frame = new JFrame();
		JTextArea text = new JTextArea();
		frame.add(text);
		Socket socket = new Socket("localhost", 6588);
		String name = socket.getInetAddress().toString();
		BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
		frame.pack();
		frame.setVisible(true);
		while(true){
			String input = bR.readLine();
			System.out.println(name + ": " + input);
		}
	}

}