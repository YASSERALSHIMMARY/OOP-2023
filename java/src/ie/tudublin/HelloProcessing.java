package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet {
	int mode = 0;

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);		
		// strokeWeight(0);
		noStroke();
	}

	public void keyPressed() {
		mode = key - '0';
		println(mode);

	}

	int i = 0, j = 0;
	float off;

	public void draw() {
		background(255);
		//fill(255);

		switch (mode) {
			case 0:

				int numberCircle = (int) max(1, mouseX / 50.0f);
				float d = width / (float) numberCircle;
				for (j = 0; j < 10; j++) {
					for (i = 0; i < 10; i++) {

						float x = (d * 0.5f) + (d * i);
						float y = (d * 0.5f) + (d * j);
						float c = ((i + j) / ((numberCircle - 1) * 2.0f)) * 255.0f;
						fill((c + off) % 256, 255, 255);
						circle(x, y, d);
					}
				}
				off += (mouseY / 50.0f);
				break;
			case 1:
				break;
			default:
				break;
		}

	}
}