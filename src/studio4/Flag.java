package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setScale(0, 100);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(50, 50, 50, 50);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(50, 25, 50, 25);
		
		StdDraw.setPenColor(Color.BLUE);
		double[] x = {25, 25, 15};
		double[] y = {75, 25, 50};
		StdDraw.filledPolygon(x, y);
	}
}