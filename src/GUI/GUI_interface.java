package GUI;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GUI_interface {
	
	public String showName;
	public int numberOfEpisodes;
	public int episodeSlider;
	public int percentageSlider;
	
	public void GUI_Interface()
	{
		
		
	//pull information about show	
		
		
		
		
		
	Box Mainbox3 = Box.createHorizontalBox();
	JFrame frame = new JFrame();
	
	frame.add(Mainbox3);
	frame.pack();
	frame.setVisible(true);
	
	frame.setSize(1000, 800);
	
	
	
	
	
	
	}
	
	public static void main(String[] args) //the main method
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new GUI_interface(); }
		});
	}	
	
	
	
	
	
	
	

	
	
	
	
	
	

	

}
