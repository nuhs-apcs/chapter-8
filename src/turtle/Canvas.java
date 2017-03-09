package turtle;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	private BufferedImage image;
	private Graphics2D g2d;
	
	private int width, height;
	
	public Canvas(int w, int h) {
		width = w;
		height = h;
		
		image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		g2d = image.createGraphics();
		g2d.translate(width / 2.0, height / 2.0);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image, 0, 0, null);
	}
	
	public Graphics2D getGraphics() {
		return g2d;
	}
	
}