package process;

import ij.process.ImageProcessor;

public class Process {

	public void process(ImageProcessor ip, double value) {
		for (int x=0; x < ip.getWidth(); x++)
		for (int y=0; y < ip.getHeight(); y++)
			ip.putPixelValue(x, ip.getHeight()-1-y, ip.getPixelValue(x, y) + value);
		
	}
}
