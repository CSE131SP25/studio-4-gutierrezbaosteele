package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(1000, 600);
		StdDraw.clear(StdDraw.BLACK);
		
		Color white = new Color(255, 255, 255);
		StdDraw.setPenColor(white);
		StdDraw.setPenRadius(0.006);
		StdDraw.line(0,0.4,.41,.5);
		
		Color triangleColor = new Color(162,207,253);
		Color purple = new Color(115,27,183);
		double[] verticesX = {0.35,0.5,0.65};
		double[] verticesY = {0.35,0.7,0.35};
		
		StdDraw.setPenRadius(0.018);
		StdDraw.setPenColor(purple);
		StdDraw.line(0.598, .464, 1, .364);
		
		StdDraw.setPenColor(Color.BLUE);
		//StdDraw.setPenRadius(0.012);
		StdDraw.line(0.595, .476, 1, .376);
		
		StdDraw.setPenColor(Color.GREEN);
		//StdDraw.setPenRadius(0.012);
		StdDraw.line(0.59, .488, 1, .388);
		
		StdDraw.setPenColor(Color.YELLOW);
		//StdDraw.setPenRadius(0.012);
		StdDraw.line(0.59, .5, 1, .4);
		
		StdDraw.setPenColor(Color.ORANGE);
		//StdDraw.setPenRadius(0.012);
		StdDraw.line(0.58, .512, 1, .412);
		
		StdDraw.setPenColor(Color.RED);
		//StdDraw.setPenRadius(0.012);
		StdDraw.line(0.575, .524, 1, .424);
		
		StdDraw.setPenColor(triangleColor);
		StdDraw.setPenRadius(0.022);
		StdDraw.polygon(verticesX, verticesY);
	}
}