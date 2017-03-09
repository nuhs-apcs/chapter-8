package turtle;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Turtle {
	
	private Graphics2D g2d;
	private double x, y, heading;
	
	private Stack<double[]> stateStack;
	
	public Turtle(Canvas canvas) {
		stateStack = new Stack<double[]>();
		this.g2d = canvas.getGraphics();
	}
	
	public void forward(double len) {
		double x2 = x + len * Math.cos(Math.toRadians(heading));
		double y2 = y + len * Math.sin(Math.toRadians(heading));
		g2d.drawLine((int) Math.round(x), (int) Math.round(y), (int) Math.round(x2), (int) Math.round(y2));
		x = x2;
		y = y2;
	}
	
	public void backward(double len) {
		forward(-len);
	}
	
	public void circle(double radius) {
		g2d.draw(new Ellipse2D.Double(x - radius, y - radius, 2 * radius, 2 * radius));
	}
	
	public void right(double angle) {
		this.heading += angle;
	}
	
	public void left(double angle) {
		right(-angle);
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void moveTo(double x, double y) {
		setX(x);
		setY(y);
	}
	
	public void setHeading(double heading) {
		this.heading = heading;
	}
	
	public void pushState() {
		stateStack.push(new double[]{ x, y, heading});
	}
	
	public void popState() {
		double[] state = stateStack.pop();
		x = state[0];
		y = state[1];
		heading = state[2];
	}

}
