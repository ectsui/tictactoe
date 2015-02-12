package tictactoe;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
/*
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
*/
/*import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
*/

public class MainWindow extends JFrame //implements ActionListener
{
	//private int turns;
	//private String move;
	//private char player;
	
	public MainWindow(String move, char player) 
	{
	
		//creates JPanel and sets layout
		JPanel corePanel = new JPanel();
		corePanel.setLayout(new BorderLayout());
	
		//creates text/instructions/text input
		JLabel status = new JLabel("Let's play Tic Tac Toe!",SwingConstants.CENTER);
		JLabel turn = new JLabel("Current player: "+player,SwingConstants.CENTER);
		JLabel prompt = new JLabel("Please enter a space on the grid [a-c][1-3]",SwingConstants.CENTER);
		final JTextField input = new JTextField();
	
		//adds JLabels to JPanel/creates southpanel for JLabels 
		JPanel southPanel = new JPanel(new GridLayout(4,1));
		southPanel.add(status);
		southPanel.add(prompt);
		southPanel.add(input);
		southPanel.add(turn);
		
		//adds southpanel 
		corePanel.add(southPanel, BorderLayout.SOUTH);
		
		//creates/adds tictactoe board
		tictactoe tct = new tictactoe();
		corePanel.add(tct, BorderLayout.CENTER);
		
		//creates and action listener for text input
		input.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				//checks if text input is 2 chars long and starts with [a-c] and ends with [1-3]
				String text = input.getText();
				if(text.length() == 2 && text.matches("[a-c]"+"[1-3]"))
				{
					
				}
				else 
				{
					
					final JFrame error = new JFrame();
					error.setTitle("Error");
				    JLabel errorStatus = new JLabel("Invalid Input!",SwingConstants.CENTER);
				    error.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				    error.add(errorStatus);
				    error.pack();
				    error.setLocationRelativeTo(null);
				    error.setVisible(true);
				    
				    /*input.addKeyListener(new KeyListener()
				    {
				    	@Override
				    	public void keyPressed(KeyEvent e) {
				    		// TODO Auto-generated method stub
				    		if(e.getKeyCode() == KeyEvent.VK_ENTER)
				    		{
				    			error.setVisible(false);
				    		}
				    
				    	}
				    });*/	
				 
				 
				}
				input.setText("");
			}
		});
		
		this.add(corePanel,BorderLayout.CENTER);
		this.setTitle("Tic Tac Toe");
		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		/*JFrame intro = new JFrame();
		intro.setTitle("Tic Tac Toe!");
		intro.setSize(500,500);
		JLabel introduction = new JLabel("Let's play Tic Tac Toe! Each player selects a spot on the board, starting with X.",SwingConstants.CENTER);
		intro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		intro.add(introduction,SwingConstants.CENTER);
		intro.setLocationRelativeTo(null);
		intro.setVisible(true);
		*/
		
	}

	/*
	public static void main(String[] args) 
	{
		new MainWindow();
	}
	*/

}

