package oopBaddies;

import processing.core.PApplet;

import ie.tudublin.Visual;

public class paris extends Visual {

  Start paris;

  public paris(Start paris) {

    this.paris = paris;
  }

  // declare the variable

  int cols, rows;
  int scl = 20;
  int w = 6000;
  int h = 1900;

  float wave = 0;
  float[][] ocean;

  // declare the plane variable

  int planeX = 0; 
  int planeY = height / 5; 

  // this is the start of the draw render

  void render() {

    // calulate average

    float avg = 0;
    for (int i = 0; i < ab.size(); i++) {
      avg += abs(ab.get(i));
    }
    avg = avg / ab.size();
    float smoothedavg = 0;
    smoothedavg = lerp(smoothedavg, avg, 0.1f);

    // variable for the ocean wave

    cols = w / scl;
    rows = h / scl;
    ocean = new float[cols][rows];

    // wave movement setting

    wave -= 0.04;
    float yoff = wave;
    for (int y = 0; y < rows; y++) {
      float xoff = 0;
      for (int x = 0; x < cols; x++) {
        ocean[x][y] = map(noise(xoff, yoff), 0, 1, -300, 20);
        xoff += 0.06;
      }
      yoff += 0.06;
    }

    // colouring of the background

    paris.background(10, 20, 50);
    paris.stroke(255);
    paris.noFill();

    // this is to add the rainbow pixel effect

    paris.fill(random(255), random(255), random(255), 300);
    paris.noStroke();
    paris.rect(random(w), random(h), 25, 25);

    // adding shading to the ocean wave

    paris.pushMatrix();
    paris.translate(width / 2, height / 2 + 2);
    paris.rotateX(PI / 3);

    // colouring of the blue ocean

    paris.noStroke();
    paris.fill(0, 191, 255, 100);
    paris.frameRate(15);

    // wave movement setting

    paris.translate(-w / 2, +300);
    for (int y = 0; y < rows - 1; y++) {
      paris.beginShape(PApplet.TRIANGLE_STRIP);
      for (int x = 0; x < cols; x++) {
        paris.vertex(x * scl, y * scl, ocean[x][y]);
        paris.vertex(x * scl, (y + 1) * scl, ocean[x][y + 1]);
      }
      paris.endShape();
    }

    paris.popMatrix();

    // drawing of the moon

    paris.pushMatrix();
    paris.translate(+1000, +130);
    paris.fill(250, 250, 200, 200);
    paris.noStroke();
    paris.ellipse(width - 100, height - 25, 400 + (smoothedavg * 600), 400 + (smoothedavg * 600));
    paris.popMatrix();

    // drawing of the left rainbow heart

    paris.pushMatrix();
    paris.translate(+500, +160);
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

    // drawing of the right rainbow heart

    paris.pushMatrix();
    paris.translate(1500, +160);
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

    // drawing plane that fly across the screen

    paris.pushMatrix();
    paris.translate(0, 160);
    paris.fill(200);
    paris.stroke(64, 64, 64, 128);
    paris.strokeWeight(2);
    paris.beginShape();
    paris.vertex(planeX, planeY);
    paris.vertex(planeX + 40, planeY - 20);
    paris.vertex(planeX + 120, planeY);
    paris.vertex(planeX + 40, planeY + 20);
    paris.endShape(CLOSE);
    paris.fill(128, 192, 255, 128);
    paris.stroke(64, 64, 64, 128);
    paris.ellipse(planeX + 50, planeY - 5, 55, 25);
    paris.popMatrix();

    // update plane's position
    
    planeX += 3;
    if (planeX > width + 1800) { // reset plane's position when it goes off screen
      planeX = -1000;

    }

  }
}