import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

//import javax.swing.JFrame;
//
//import java.awt.Color;

public class GameFrame extends JFrame{
     
	GamePanel panel ; 
	
	GameFrame(){
		panel  = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.pack();  // defined in Window class in Java and it sizes the frame so that all its contents are at or above their preferred sizes
		this.setVisible(true);
		this.setLocationRelativeTo(null); // it show the window at center
		
	}
}
