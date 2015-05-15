package ServerTrials;

import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.sun.glass.events.WindowEvent;

public class ClientTest {

	private JFrame frame;
	private JTextArea text;

	public ClientTest() {
		frame = new JFrame();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setText(new JTextArea());
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("Closed");
				frame.dispose();
			}
		});

		frame.pack();
		frame.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public static void main(String args[]) {
		ClientTest c = new ClientTest();
		c.getFrame().dispose();

	}

	public JTextArea getText() {
		return text;
	}

	public void setText(JTextArea text) {
		this.text = text;
	}

}
