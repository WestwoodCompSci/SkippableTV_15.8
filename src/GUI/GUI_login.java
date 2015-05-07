
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.*;

import javax.swing.Box;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUI_login {
	
	public Box mainBox;
	
	public GUI_login()
	{
		JFrame myFrame = new JFrame();
		mainBox = Box.createHorizontalBox();
		
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
		
		veriBox3.add(Box.createVerticalStrut(212));
		veriBox3.add(new JButton("Login!"));
		veriBox3.add(Box.createVerticalStrut(297));
		veriBox3.add(new JButton("Create!"));
		
		
		mainBox.add(veriBox1);
		mainBox.add(veriBox2);
		mainBox.add(veriBox3);
		
		//myFrame.add(mainBox);
	
		//myFrame.pack();
		//myFrame.setVisible(true);
		
		//myFrame.setSize(700,700);
		//mainBox.setSize(700,700);
		
		
	}
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new GUI_login(); }
		});
	}
	

}

