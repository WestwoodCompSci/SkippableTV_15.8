package GUI;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GUI_interface {
	public Box  Mainbox3;
	//public String showName;
	//public int numberOfEpisodes;
	//public int episodeSlider;
	//public int percentageSlider;
	
	public  GUI_interface()
	{
		
		
	//pull information about show	
		
		
		
		
		
	Mainbox3 = Box.createVerticalBox();
	Box box1 = Box.createHorizontalBox();
	Box box2 = Box.createHorizontalBox();

	JLabel walkingDead = new JLabel("Walking Dead");
	JButton Season1 = new JButton("Season 1:");
	JButton Season2 = new JButton("Season 2:");
	JButton Season3 = new JButton("Season 3:");
	JButton Season4 = new JButton("Season 4:");
	
	box1.add(walkingDead);
	box2.add(Season1);
	box2.add(Season2);
	box2.add(Season3);
	box2.add(Season4);
	Mainbox3.add(box1);
	Mainbox3.add(box2);
	
	
	
	//JFrame frame = new JFrame();
	
	//frame.add(Mainbox3);
	//frame.pack();
	//frame.setVisible(true);
	
	//frame.setSize(1000, 800);
	Mainbox3.setSize(1000,800);
	
	}
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new GUI_interface() ;}
		});
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	

	

