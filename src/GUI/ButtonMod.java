package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;






class ButtonMod extends JButton{
	
	
	public ButtonMod(String text)
	{
		
		super(text);
		
		
	}
@Override
	public void paint(Graphics g) {
       
        
        g.setColor(Color.red);
       
        g.fillRect(this.getX(), getY(), getWidth(), getHeight());
        
        
//public ButtonMod (String text, int i, int e, int u) {
	//this.setText(text);
	 //this.setBackground(new Color(i,e,u));
	 //a.setForeground(Color.WHITE);
	 //a.setFont(new Font("Tohoma", Font.BOLD, 13));
	 //this.setFocusPainted(true);
	 //a.setFont(new Font("Tohoma", Font.BOLD, 13));
	 //if ( t == true)
	 //{
		// active listener
	 //}
	 ///if ( h == true)
	 //{
		// active listener
	 //}
	 //if ( g == true)
	// {
		// active listener
	 //}
	 
	 
	}
	


}
/*you need to finish code, to fit the needs of the buttons 
that you will  be producing with this constructor*/



