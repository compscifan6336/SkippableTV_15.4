package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SFrame extends JFrame{
	public static int width = 1000;
	public static int height = 700;
	
	public SFrame(){
		//Initial Values
		
		this.setTitle("Skippable TV");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Finishing Up
		
		this.pack();
		
		this.setSize(width, height);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - width)/ 2);
	    int y = (int) ((dimension.getHeight() - height) / 2);
	    
	    this.setLocation(x, y);
	    
	    this.add(new CustomButton("Blah"));
	    
		this.setResizable(false);
		this.setVisible(true);
	}
	
	class CustomButton extends JButton{
		public CustomButton(String s){
			super(s);
		}
		
		public void paintComponent(Graphics g){
			g.setColor(Color.BLUE);
			g.fillOval(100, 100, 50, 50);
		}
	}
}