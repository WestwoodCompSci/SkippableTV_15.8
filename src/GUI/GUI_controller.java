package GUI;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GUI_controller {
	
	JFrame frame = new JFrame();
	JApplet applet = new JApplet();
	
	
	
	public static void main(String[] args) //the main method
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new GUI_login(); }
		});
	}


}
