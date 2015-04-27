package GUI;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.*;

import javax.swing.Box;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUI_login {
	
	private JApplet applet;
	
	public GUI_login()
	{
		applet = new JApplet();
		
		Box mainBox = Box.createVerticalBox();
		
		Box horiBox1 = Box.createHorizontalBox();
		horiBox1.add(new JLabel("Username"));
		horiBox1.add(new JTextField());
		
		Box horiBox2 = Box.createHorizontalBox();
		horiBox1.add(new JLabel("Password"));
		horiBox1.add(new JTextField());
		horiBox1.add(new JButton("Login!"));
		
		Box horiBox3 = Box.createHorizontalBox();
		horiBox1.add(new JLabel("New Account"));
		horiBox1.add(new JTextField());
		
		Box horiBox4 = Box.createHorizontalBox();
		horiBox1.add(new JLabel("Username"));
		horiBox1.add(new JTextField());
		
		Box horiBox5 = Box.createHorizontalBox();
		horiBox1.add(new JLabel("Password"));
		horiBox1.add(new JTextField());
		
		Box horiBox6 = Box.createHorizontalBox();
		horiBox1.add(new JLabel("Re-Enter Password"));
		horiBox1.add(new JTextField());
		
		
		
		applet.add(new JLabel("User Login"));
		applet.add(new JLabel("Username"));
		
		applet.add(new JTextField());
		applet.add(new JLabel("Password"));
		
	
		
		applet.add(mainBox);
	}
	public static void main(String[] args) //the main method
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new GUI_login(); }
		});
	}

}

