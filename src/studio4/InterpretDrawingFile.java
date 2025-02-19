package studio4;

import java.awt.Color;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String firstValue = in.next();
		
		//System.out.println(firstValue);
		
		int redComp = in.nextInt();
		
		//System.out.println(redComp);
		
		int greenComp = in.nextInt();
		
		//System.out.println(greenComp);
		
		int blueComp = in.nextInt();
		
		//System.out.println(blueComp);
		
		boolean isFilled = in.nextBoolean();
		
		//System.out.println(isFilled);
		
		//rectangle
		if (firstValue.equals("rectangle")) {
		
		double x = in.nextDouble();
		
		double y = in.nextDouble();
		
		double halfWidth = in.nextDouble();
		
		double halfHeight = in.nextDouble();
		
		Color ourColor = new Color(redComp, greenComp, blueComp);
		StdDraw.setPenColor(ourColor);
		
		if (isFilled) {
			StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		} else {
			StdDraw.rectangle(x, y, halfWidth, halfHeight);
		}
		
		} else if (firstValue.equals("ellipse")) {
			double x = in.nextDouble();
			
			double y = in.nextDouble();
			
			double halfWidth = in.nextDouble();
			
			double halfHeight = in.nextDouble();
			
			Color ourColor = new Color(redComp, greenComp, blueComp);
			StdDraw.setPenColor(ourColor);
			
			if (isFilled) {
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			} else {
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
		}
	}
}
