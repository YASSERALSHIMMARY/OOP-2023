package ie.tudublin;

import processing.core.PApplet;


public class StarMap extends PApplet
{
	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);		
		
	}
	public void drawGrid(){
		stroke(255);
		float border = width * 0.1f;

		for (int i = -5; i<= 5; i++)
		{
			float x = map(i,-5,5,border,width - border);
			line(x, border, x, height - border);
			line(border, x, width - border, x);
			textAlign(CENTER,CENTER);
			text(i, x,border * 0.5f);
			text(i,border * 0.5f,x);
		}
	}

		
	public void draw()
	{	
		strokeWeight(1);
		drawGrid();			
	}
}
