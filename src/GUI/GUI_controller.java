package GUI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUI_controller {
	public static  GUI_controller controller;
	public static GUI_login login;
	public static  GUI_selection selection;
	public JApplet applet;
	
	public JFrame frame1;
	{
		
	
		
		
		
		
	JFrame frame1 = new JFrame();
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Box Mainbox = Box.createVerticalBox();
	Box box1 = Box.createHorizontalBox();
	Box box2 = Box.createHorizontalBox();
	JApplet applet = new JApplet();
	
	
	JButton loginB = new JButton("Login");
	//JButton signUp = new JButton("Sign Up");
	//
	JLabel picture = new JLabel(new ImageIcon("H:\\SkippableTV_15.8\\smoother logo.png" ));
	
	box1.add(picture);
	box2.add(Box.createHorizontalStrut(85));
	box2.add(loginB);
	box2.add(Box.createHorizontalStrut(100));
	//box2.add(signUp);
	
	Mainbox.add(box1);
	Mainbox.add(box2);
	
	applet.add(Mainbox);
	
	frame1.add(applet);
	frame1.pack();
	frame1.setVisible(true);
	frame1.setLocation(200, 50);
	frame1.setSize(1000, 800);
	
	
	
	
	
loginB.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		applet.remove(Mainbox);
		applet.add(login.Mainbox1);
		
		frame1.validate();
		//frame1.pack();
		//frame1.setVisible(true);
		frame1.setLocation(200, 50);
		frame1.setSize(1000, 800);
		
		
	}
		
			
	
	});

	}

	
	
	public static void main(String[] args) //the main method
	{
		selection = new GUI_selection();
		login = new GUI_login();
		controller = new GUI_controller();
		
		
		
		
	}


}
