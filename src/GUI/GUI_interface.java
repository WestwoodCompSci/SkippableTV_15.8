package GUI;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GUI_interface {
	
	public void GUI_Interface()
	{
	Box box1 = Box.createHorizontalBox();
	JFrame frame = new JFrame();
	
	frame.add(box1);
	frame.pack();
	frame.setVisible(true);
	
	frame.setSize(1000, 800);
	
	
	public static void main(String[] args) //the main method
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new GUI_interface(); }
		});
	}	
	
	
	
	
	
	
	

	
	
	
	
	
	
	}
	

}
