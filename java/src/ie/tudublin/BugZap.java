package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet 
{

	float playerX, playerY, playerWidth;
	float bugX, bugY, bugWidth;

	int score = 0;
	float halfPlayer, halfBug;

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		smooth();

		playerX = width *0.5f;
		playerY = height - 100;	
		playerWidth = 50;
		halfPlayer = playerWidth * 0.5f;
	}
	

	

	void resetBug() {
		bugY = 50;
		bugWidth = 50;
		halfBug = bugWidth * 0.5f;
		bugX = random(halfBug, width - halfBug);
		
	}

	void drawPlayer(float x, float y, float w) 		
	{
		noFill();
		stroke(255);
		rectMode(CENTER);
		rect(x,y,w,w);
		line(x,y - halfPlayer, x, y-halfPlayer * 2);


	}

	public void draw(){

		background(0);
		drawPlayer(playerX,playerY,playerWidth);

	}
	public void keyPressed() 
	{
		if (keyCode == LEFT)
		{
			playerX --;
		}
		if (keyCode == RIGHT)
		{
			playerX ++;
		}
		if (keyCode == ' ')
		{
			line(playerX,playerY -halfPlayer,playerX,0);
		}
		else
		{
			line(playerX, playerY, playerX, 0);
			
		}
		

	}

	
}
