package oopBaddies;

import ie.tudublin.Visual;
import processing.core.PVector;
import java.util.ArrayList; 


public class paris extends Visual{
    

    Start paris;

    ArrayList<PVector> tinyHearts = new ArrayList<PVector>(); // lists to hold tiny hearts

    public paris(Start paris) {

        this.paris = paris;
    }
<<<<<<< HEAD
=======
    
    
    int cols, rows;
    int scl = 30;
    int w = 6000;
    int h = 1900;
>>>>>>> 052060955ac656a1f7b2c8f0154678dd4bc0c229

    public void setup()
    {
        paris.size(5000, 5000);yy
    }
    
    
    public void mainHeart(float a, float b, float c, float d) {
            float size = 1 * width / 40; // set the main heart the same width of the screen divided by 40
            paris.noStroke();
            paris.fill(random(255), random(255), random(255), 200);
            paris.pushMatrix(); // saving the current transformation matrix
            paris.translate(width/2, height/2); // translate to the center of the screen
            paris.scale(size); // scale the main heart
            paris.beginShape();
            paris.vertex(a, b);
            paris.bezierVertex(a-40, b-40, a-60, b+20, a, b+60);
            paris.bezierVertex(a+60, b+20, a+40, b-40, a, b);
            paris.endShape();
            paris.popMatrix(); // restoring the previous transformation matrix
        }
        
    
    public void tinyHeart(float a, float b, float c, float d) {
        float size = 2 * width / 60; // set the size of the tiny hearts to be 2 times the width of the screen divided by 60
        for (PVector tinyHeart : tinyHearts) {
            paris.noStroke();
            paris.fill(random(255), random(255), random(255), 200);
            paris.pushMatrix(); // saving the current transformation matrix
            paris.translate(width/2, height/2); // translate to the center of the screen
            paris.scale(size); // scale the tiny heart
            paris.beginShape();
            paris.vertex(tinyHeart.x, tinyHeart.y); // access the x and y components of the PVector
            paris.bezierVertex(tinyHeart.x-30, tinyHeart.y-30, tinyHeart.x-50, tinyHeart.y+10, tinyHeart.x, tinyHeart.y+50);
            paris.bezierVertex(tinyHeart.x+50, tinyHeart.y+10, tinyHeart.x+30, tinyHeart.y-30, tinyHeart.x, tinyHeart.y);
            paris.endShape();
            paris.popMatrix(); // restoring the previous transformation matrix
        }
    }
    
    
    //Start of the draw render
    void render() {

         //calulating average
         float avg = 0;
         for (int i = 0; i < ab.size(); i++)
         {
             avg += abs(ab.get(i));
         }
         avg = avg / ab.size();
         float smoothedavg = 0;
         smoothedavg = lerp(smoothedavg, avg, 0.1f);
 
        
        float a, b;  // these are the position of the heart
        float va, vb;  
        float ac, bd;  
        float damping = 1;  // damping factor for the bouncing motion of the hearts
        boolean isBouncingA = false; 
        boolean isBouncingB = false; //  to indicate whether the heart is bouncing off the X or Y edge

        a = random(width);  // set initial a,b position and velocity at random
        b = random(height);  
        va = random(-10, 10);  
        vb = random(-10, 10);  
        ac = 0;
        bd = 0;
        paris.background(color(255, 192, 203, 200));

<<<<<<< HEAD
        paris.ellipse(width + 200, height + 100 , 300 + (smoothedavg*600) , 300 + (smoothedavg*600));
=======
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
>>>>>>> 052060955ac656a1f7b2c8f0154678dd4bc0c229

        mainHeart(a, b, 0, 0); // draw the main heart
        tinyHeart(a, b, 0, 0); // draw the tiny hearts
        
        // updating the heart's velocity and position
        va += ac;
        vb += bd;
        a += va;
        b += vb;
        
        // check if heart bounces off the edges of the screen
        if (a < 0 || a > width) {
            if (!isBouncingA) {
                // it will then create a mini heart at the current position
                tinyHearts.add(new PVector(a, b));
                va = -va * damping;
                isBouncingA = true;
            }
        } else {
            isBouncingA = false;
        }
        
        if (b < 0 || b > height) {
            if (!isBouncingB){
                    // it will create a mini heart at the current position
                    tinyHearts.add(new PVector(a, b));
                    vb = -vb * damping;
                    isBouncingB = true;
      }
    } else {
      isBouncingB = false;
    }
    
    // loop through all the tiny hearts
    for (PVector tinyHeart : tinyHearts) {
    float attractionMagnitude = 2;
    // calculating the attraction force between the mini heart and the main heart 
    PVector attraction = new PVector(a - tinyHeart.x, b - tinyHeart.y);
    attraction.normalize();
    attraction.mult((float) attractionMagnitude);
    // this will apply attraction force to mini heart
    tinyHeart.add(attraction);
  }
}
    }
