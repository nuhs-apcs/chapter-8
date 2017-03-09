package turtle;

import javax.swing.*;

public class Screen extends JFrame {
	
	private Canvas canvas;
	
	public Screen() {
		this(750, 750);
	}
	
	public Screen(int width, int height) {
		this.canvas = new Canvas(width, height);
		
		setTitle("Turtle");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(this.canvas);
		pack();
		
		setVisible(true);
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
}
