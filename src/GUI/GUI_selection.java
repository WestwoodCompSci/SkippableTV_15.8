package GUI;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GUI_selection {
	public Box Mainbox2;
	public GUI_selection()
	{
		//JFrame frame1 = new JFrame();
		//frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Mainbox2 = Box.createVerticalBox();
		Box box1 = Box.createHorizontalBox();
		Box box2 = Box.createHorizontalBox();
		
		JLabel add = new JLabel("Select one of your shows");
		JButton continue0 = new JButton("Continue");
		JButton back = new JButton("Back");
		box1.add(add);
		Mainbox2.add(box1);
		Mainbox2.add(Box.createVerticalStrut(200));
		Mainbox2.add(box2);
		
		ArrayList <String>select0 = new ArrayList<String>();
		select0.add("Breaking Bad");
		select0.add("The Walking Dead");
		String [] select00 = new String [select0.size()];
		for (int i = 0; i < select0.size();i++)
		{
			select00[i] =  select0.get(i);
		}
		
		JComboBox <String> select = new JComboBox<String>(select00);
		box2.add(select);
		box1.add(Box.createHorizontalStrut(75));
		box1.add(continue0);
		box1.add(Box.createHorizontalStrut(75));
		box1.add(back);

		//frame1.pack();
		//frame1.setVisible(true);
		Mainbox2.setSize(1000,800);
		
		
		
		
		
		
	}
	
}
