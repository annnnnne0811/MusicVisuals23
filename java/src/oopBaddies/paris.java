package oopBaddies;

import processing.core.PApplet;


import ie.tudublin.Visual;


public class paris extends Visual{
    

    Start paris;

    public paris(Start paris) {

        this.paris = paris;
    }
    
    
    int cols, rows;
    int scl = 30;
    int w = 6000;
    int h = 1900;

    
    float wave = 0;
    
    float[][] landscape;
    

    //Start of the draw render
    void render() {
  cols = w/scl;
  rows = h/scl;
  landscape = new float [cols][rows];

  wave -= 0.1;
  float yoff = wave;
  for (int y = 0; y < rows; y++) {
    float xoff = 0;
    for (int x = 0; x< cols; x++) {
      landscape[x][y] = map(noise(xoff, yoff), 0, 1, -100, 100);
      xoff += 0.2;
    }
    yoff += 0.2;
}

paris.background(10, 20, 50);
paris.stroke(255);
paris.noFill();

paris.fill(random(255), random(255), random(255),300);
paris.noStroke();
paris.ellipse(random(w), random(h), 20, 20);

paris.pushMatrix();
paris.translate(width/2, height/2+50);
paris.rotateX(PI/3);
paris.frameRate(1);

// Colouring the landscape
paris.noStroke();
paris.fill(255, 0, 255, 100);

paris.translate(-w/2, -h/2);
for (int y = 0; y < rows-1; y++) {
    paris.beginShape(PApplet.TRIANGLE_STRIP);
    for (int x = 0; x< cols; x++) {
      paris.vertex(x*scl, y*scl, landscape[x][y]);
      paris.vertex(x*scl, (y+1)*scl, landscape[x][y+1]);
    }
    paris.endShape();
  }
  
paris.popMatrix();

// Draw grey circle in the center

// Draw orange sphere on the top
paris.pushMatrix();
paris.translate(width/2, height/2-400);
paris.fill(255, 200, 0, 200);
paris.noStroke();
paris.sphere(140);
paris.popMatrix();

// the sun glistening

paris.pushMatrix();
paris.translate(width/2, height/2-400);
paris.rotateZ(PI/7);
paris.fill(255, 200, 0, 200);
paris.noStroke();
paris.sphere(140);

paris.fill(255, 255, 255, 50);
paris.rotateX(PI/2);
paris.popMatrix();

// draw hearts

paris.pushMatrix();
paris.translate(width/2+950, height/2-300);
paris.fill(random(255), random(255), random(255), 150);
paris.noStroke();
paris.beginShape();
paris.vertex(0, -50, 0);
paris.bezierVertex(0, -80, -30, -100, -60, -100);
paris.bezierVertex(-90, -100, -90, -50, -90, -50);
paris.bezierVertex(-90, -20, -70, 0, 0, 30);
paris.bezierVertex(70, 0, 90, -20, 90, -50);
paris.bezierVertex(90, -50, 90, -100, 60, -100);
paris.bezierVertex(30, -100, 0, -80, 0, -50);
paris.endShape(CLOSE);
paris.popMatrix();

paris.pushMatrix();
paris.translate(width/2-950, height/2-300);
paris.fill(random(255), random(255), random(255), 150);
paris.noStroke();
paris.beginShape();
paris.vertex(0, -50, 0);
paris.bezierVertex(0, -80, -30, -100, -60, -100);
paris.bezierVertex(-90, -100, -90, -50, -90, -50);
paris.bezierVertex(-90, -20, -70, 0, 0, 30);
paris.bezierVertex(70, 0, 90, -20, 90, -50);
paris.bezierVertex(90, -50, 90, -100, 60, -100);
paris.bezierVertex(30, -100, 0, -80, 0, -50);
paris.endShape(CLOSE);
paris.popMatrix();

// testing

paris.pushMatrix();
paris.translate(+700, +110);
paris.fill(random(255), random(255), random(255));
paris.noStroke();
paris.beginShape();
paris.vertex(0, -50, 0);
paris.bezierVertex(0, -80, -30, -100, -60, -100);
paris.bezierVertex(-90, -100, -90, -50, -90, -50);
paris.bezierVertex(-90, -20, -70, 0, 0, 30);
paris.bezierVertex(70, 0, 90, -20, 90, -50);
paris.bezierVertex(90, -50, 90, -100, 60, -100);
paris.bezierVertex(30, -100, 0, -80, 0, -50);
paris.endShape(CLOSE);
paris.popMatrix();

    }
    
    }