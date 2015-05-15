package GUI;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GUI_selection {
	public Box Mainbox2;
	public GUI_selection()
	{
		JFrame frame1 = new JFrame();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Box Mainbox2 = Box.createVerticalBox();
		Box box1 = Box.createHorizontalBox();
		Box box2 = Box.createHorizontalBox();
		
		JLabel add = new JLabel("Select one of your shows");
		box1.add(add);
		Mainbox2.add(box1);
		Mainbox2.add(box2);

		frame1.pack();
		frame1.setVisible(true);
		Mainbox2.setSize(1000,800);
		
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new GUI_selection(); }
		});
	}
	
	
	
	
	
	
}
