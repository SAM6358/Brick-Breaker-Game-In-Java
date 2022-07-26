import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame obj=new JFrame();
		Gameplay gamePlay = new Gameplay();
		
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker Game In Java");		
		obj.setResizable(false); //can only be played in normal mode. false refers to that the screen can not be maximized.
		obj.setVisible(true); // so that the windo or panel can be visible.
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
                obj.setVisible(true);
		
	}

}
