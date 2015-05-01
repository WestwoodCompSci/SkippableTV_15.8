package GUI;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.*;

import javax.swing.Box;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUI_login {
	
	private Box mainBox;
	
	public GUI_login()
	{
		mainBox = Box.createVerticalBox();
		
		Box horiBox1 = Box.createHorizontalBox();
		horiBox1.add(new JLabel("Username"));
		horiBox1.add(new JTextField());
		
		Box horiBox2 = Box.createHorizontalBox();
		horiBox2.add(new JLabel("Password"));
		horiBox2.add(new JTextField());
		horiBox2.add(new JButton("Login!"));
		
		Box horiBox3 = Box.createHorizontalBox();
		horiBox3.add(new JLabel("New Account"));
		horiBox3.add(new JTextField());
		
		Box horiBox4 = Box.createHorizontalBox();
		horiBox4.add(new JLabel("Username"));
		horiBox4.add(new JTextField());
		
		Box horiBox5 = Box.createHorizontalBox();
		horiBox5.add(new JLabel("Password"));
		horiBox5.add(new JTextField());
		
		Box horiBox6 = Box.createHorizontalBox();
		horiBox6.add(new JLabel("Re-Enter Password"));
		horiBox6.add(new JTextField());
		horiBox6.add(new JButton("Create!"));
		
		mainBox.add(horiBox1);
		mainBox.add(horiBox2);
		mainBox.add(horiBox3);
		mainBox.add(horiBox4);
		mainBox.add(horiBox5);
		mainBox.add(horiBox6);
		
	
		
		mainBox.setVisible(true);
		
		mainBox.setSize(700,700);
	}
	public static void main(String[] args) //the main method
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new GUI_login(); }
		});
	}

}

