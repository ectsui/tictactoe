package tictactoe;

import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class tictactoe extends JPanel
   {
		private int turn;
		
		public tictactoe() 
		{
			super();
			setPreferredSize(new Dimension(500, 500));
			setOpaque(true); 
		}
		
		//private int board;
		public void tictactoe()
		{
			int[][] board = { {0,0,0}, {0,0,0}, {0,0,0}};
		}
		
		
		
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
		    g2.setColor(Color.BLACK);
		    
		    //draws board
		    g2.fillRect(2*getWidth() / 5 , getHeight() / 5 , 4, getHeight() - 2*(getHeight() / 5));
		    g2.fillRect(3*getWidth() / 5 , getHeight() / 5 , 4, getHeight() - 2*(getHeight() / 5));
		    g2.fillRect(getWidth() / 5 , 2*getHeight() / 5 , getWidth() - 2*getWidth()/5, 4);
		    g2.fillRect(getWidth() / 5 , 3*getHeight() / 5 , getWidth() - 2*getWidth()/5, 4);
		    
		    //draws x
		    //g2.setStroke( new BasicStroke(4));  
		    //g2.drawLine(getWidth() / 6 , getHeight() / 6, getWidth()  /9 ,getHeight() / 9);
	    }
		
		/*public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g; 
		      
		    g2.setColor(Color.BLACK);
		      
		    g2.setStroke( new BasicStroke(4));  
		    g2.drawLine(getWidth() / 6 , getHeight() / 6, getWidth()  /9 ,getHeight() / 9);  
		}
		*/
		
		public static void main(String[] args)
		{
			new MainWindow("",'\0');
			
		}
   }
