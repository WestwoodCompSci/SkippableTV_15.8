package GUI;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.Box;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import networking.NetworkClient;

public class GUI_login {
	
	public Box Mainbox1;
	
	
	public GUI_login()
	{
		//JFrame myFrame = new JFrame();
		Mainbox1 = Box.createHorizontalBox();
		
		Box veriBox1 = Box.createVerticalBox();
		Box veriBox2 = Box.createVerticalBox();
		Box veriBox3 = Box.createVerticalBox();
		
		JLabel label1 = new JLabel("Username");
		veriBox1.add(label1);
		veriBox1.add(Box.createVerticalStrut(92));
		veriBox2.add(Box.createVerticalStrut(40));
		veriBox2.add(new JTextField());
		veriBox2.add(Box.createVerticalStrut(60));
		

		veriBox1.add(new JLabel("Password"));
		veriBox1.add(Box.createVerticalStrut(92));
		veriBox2.add(new JTextField());
		veriBox2.add(Box.createVerticalStrut(60));
		
		Box horiBox3 = Box.createHorizontalBox();
		veriBox1.add(new JLabel("New Account"));
		veriBox1.add(Box.createVerticalStrut(92));
		veriBox2.add(new JTextField());
		veriBox2.add(Box.createVerticalStrut(60));
		
		Box horiBox4 = Box.createHorizontalBox();
		veriBox1.add(new JLabel("Username"));
		veriBox1.add(Box.createVerticalStrut(92));
		veriBox2.add(new JTextField());
		veriBox2.add(Box.createVerticalStrut(60));
		
		Box horiBox5 = Box.createHorizontalBox();
		veriBox1.add(new JLabel("Password"));
		veriBox1.add(Box.createVerticalStrut(92));
		veriBox2.add(new JTextField());
		veriBox2.add(Box.createVerticalStrut(60));
		
		Box horiBox6 = Box.createHorizontalBox();
		veriBox1.add(new JLabel("Re-Enter Password"));
		veriBox2.add(new JTextField());
		veriBox2.add(Box.createVerticalStrut(40));
		
		JButton login = new JButton("Login!");
		veriBox3.add(Box.createVerticalStrut(140));
		veriBox3.add(login);
		veriBox3.add(Box.createVerticalStrut(297));
		veriBox3.add(new JButton("Create!"));
		
		
		Mainbox1.add(veriBox1);
		Mainbox1.add(veriBox2);
		Mainbox1.add(veriBox3);
		
		//myFrame.add(mainBox);
	
		//myFrame.pack();
		//myFrame.setVisible(true);
		
		//myFrame.setSize(700,700);
		Mainbox1.setSize(1000,800);
		
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//send(NetworkClient.validateUser(uName));	//
				
				
				
				GUI_controller.controller.applet.remove(GUI_controller.login.Mainbox1);
				GUI_controller.controller.applet.add(GUI_controller.selection.Mainbox2);
				
				GUI_controller.controller.frame1.validate();
				//frame1.pack();
				//frame1.setVisible(true);
				GUI_controller.controller.frame1.setLocation(200, 50);
				GUI_controller.controller.frame1.setSize(1000, 800);
				
				
			}
				
					
			
			});

			}

		
	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new GUI_login(); }
		});
	}
	

}

