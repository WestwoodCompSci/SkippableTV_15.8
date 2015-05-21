package GUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GUI_selection {
	public Box Mainbox2;
	public JComboBox <String> select;
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
		
		select0.add("The Walking Dead");
		String [] select00 = new String [select0.size()];
		for (int i = 0; i < select0.size();i++)
		{
			select00[i] =  select0.get(i);
		}
		
		 select = new JComboBox<String>(select00);
		 
		box2.add(select);
		box1.add(Box.createHorizontalStrut(75));
		box1.add(continue0);
		box1.add(Box.createHorizontalStrut(75));
		box1.add(back);

		//frame1.pack();
		//frame1.setVisible(true);
		Mainbox2.setSize(1000,800);
		
		
		
		
		
		
		continue0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				GUI_controller.controller.applet.remove(Mainbox2);
				GUI_controller.controller.applet.add(GUI_controller.interface11.Mainbox3);
				
				GUI_controller.controller.frame1.validate();
				GUI_controller.controller.applet.validate();
				
				
				
			}
				
					
			
			});

		

		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				GUI_controller.controller.applet.remove(Mainbox2);
				GUI_controller.controller.applet.add(GUI_controller.login.Mainbox1);
				
				GUI_controller.controller.frame1.validate();
				GUI_controller.controller.applet.validate();
				
				
				
			}
				
					
			
			});

		
	

		
		
		
		
		
	
	
	}}
