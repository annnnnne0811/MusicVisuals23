package oopBaddies;

import ie.tudublin.Visual;
//import processing.core.PVector;
//import processing.core.PVector;

//main class
public class Airish extends Visual {

    Start airish;

    // constructor

    public Airish(Start airish) {
        this.airish = airish;
    }

    // declaring variables
    int i = 1;
    int j = 1;
    int n = 300;
    int a = 1;

    void render() {

        // calulating average
        float avg = 0;
        for (int i = 0; i < ab.size(); i++) {
            avg += abs(ab.get(i));
        }
        avg = avg / ab.size();
        float smoothedavg = 0;
        smoothedavg = lerp(smoothedavg, avg, 0.1f);

        // make colours to music
        float c = map(avg, -1, 1, 0, 255);

        airish.background(0);// black background

        airish.noStroke();
        // fill the middle circles in white
        airish.fill(255, 255, 255);
        // if a is 1 meaning this will only appear if user presses key that allows to
        // display this drwaing
        if (a == 1) {
            // circle must be first as it will interrupt with drawing other shapes
            // draws the centre pink circle of the shape
            airish.fill(255, 182, 193);
            airish.ellipse(250, 250, 100, 100);

            airish.fill(173, 216, 230);
            airish.ellipse(175, 175, 50, 50);
            airish.triangle(175, 200, 250, 250, 200, 175);

            airish.ellipse(250, 150, 50, 50);
            airish.triangle(255, 150, 250, 250, 275, 150);

            airish.ellipse(325, 175, 50, 50);
            airish.triangle(300, 175, 250, 250, 325, 200);

            airish.ellipse(150, 250, 50, 50);
            airish.triangle(150, 255, 250, 250, 150, 275);

            airish.ellipse(350, 250, 50, 50);
            airish.triangle(350, 225, 250, 250, 350, 275);

            airish.ellipse(175, 325, 50, 50);
            airish.triangle(175, 300, 250, 250, 200, 325);

            airish.ellipse(250, 350, 50, 50);
            airish.triangle(225, 350, 250, 250, 275, 350);

            airish.ellipse(325, 325, 50, 50);
            airish.triangle(300, 325, 250, 250, 325, 300);

        } // end if

        if (a >= 3) {
            for (int i = -250; i < 1400; i += 250) {
                for (j = -250; j < 700; j += 250) {
                    airish.fill(193, 225, 193);
                    airish.ellipse(250 + i, 250 + j, 100, 100);
                    airish.fill(c, 100, 100);
                    airish.ellipse(175 + i, 175 + j, 50, 50);
                    airish.triangle(175 + i, 200 + j, 250 + i, 250 + j, 200 + i, 175 + j);
                    airish.ellipse(250 + i, 150 + j, 50, 50);
                    airish.triangle(225 + i, 150 + j, 250 + i, 250 + j, 275 + i, 150 + j);

                    airish.ellipse(325 + i, 175 + j, 50, 50);
                    airish.triangle(300 + i, 175 + j, 250 + i, 250 + j, 325 + i, 200 + j);

                    airish.ellipse(150 + i, 250 + j, 50, 50);
                    airish.triangle(150 + i, 225 + j, 250 + i, 250 + j, 150 + i, 275 + j);

                    airish.ellipse(350 + i, 250 + j, 50, 50);
                    airish.triangle(350 + i, 225 + j, 250 + i, 250 + j, 350 + i, 275 + j);

                    airish.ellipse(175 + i, 325 + j, 50, 50);
                    airish.triangle(175 + i, 300 + j, 250 + i, 250 + j, 200 + i, 325 + j);

                    airish.ellipse(250 + i, 350 + j, 50, 50);
                    airish.triangle(225 + i, 350 + j, 250 + i, 250 + j, 275 + i, 350 + j);

                    airish.ellipse(325 + i, 325 + j, 50, 50);
                    airish.triangle(300 + i, 325 + j, 250 + i, 250 + j, 325 + i, 300 + j);

                    airish.fill(0);
                    airish.ellipse(250 + i, 250 + j, n, n);

                } // end for

            } // end for

        } // end if

        if (a >= 2) {
            for (i = -125; i < 1400; i += 250) {
                for (j = -125; j < 700; j += 250) {
                    airish.fill(253, 253, 150);
                    airish.ellipse(250 + i, 250 + j, 100, 100);
                    airish.fill(200, 255, 255);

                    airish.ellipse(175 + i, 175 + j, 50, 50);
                    airish.triangle(175 + i, 200 + j, 250 + i, 250 + j, 200 + i, 175 + j);

                    airish.ellipse(250 + i, 150 + j, 50, 50);
                    airish.triangle(225 + i, 150 + j, 250 + i, 250 + j, 275 + i, 150 + j);

                    airish.ellipse(325 + i, 175 + j, 50, 50);
                    airish.triangle(300 + i, 175 + j, 250 + i, 250 + j, 325 + i, 200 + j);

                    airish.ellipse(150 + i, 250 + j, 50, 50);
                    airish.triangle(150 + i, 225 + j, 250 + 1, 250 + j, 150 + 1, 275 + j);

                    airish.ellipse(350 + i, 250 + j, 50, 50);
                    airish.triangle(350 + i, 225 + j, 250 + i, 250 + j, 350 + i, 275 + j);

                    airish.ellipse(175 + i, 325 + j, 50, 50);
                    airish.triangle(175 + i, 300 + j, 250 + i, 250 + j, 200 + i, 325 + j);

                    airish.ellipse(250 + i, 350 + j, 50, 50);
                    airish.triangle(225 + i, 350 + j, 250 + i, 250 + j, 275 + i, 350 + j);

                    airish.ellipse(325 + i, 325 + j, 50, 50);
                    airish.triangle(300 + i, 325 + j, 250 + i, 250 + j, 325 + i, 300 + j);

                } // end for

            } // end for

        } // end if

        // draw butterfly
        airish.stroke(255);
        airish.strokeWeight(2);

        airish.stroke(255);
        airish.strokeWeight(3);
        airish.fill(c, 255, 255);
        airish.quad(airish.mouseX - 60, airish.mouseY - 70, airish.mouseX - 10, airish.mouseY - 50, airish.mouseX,
                airish.mouseY, airish.mouseX - 40, airish.mouseY - 10);
        airish.quad(airish.mouseX + 60, airish.mouseY - 70, airish.mouseX + 10, airish.mouseY - 50, airish.mouseX,
                airish.mouseY, airish.mouseX + 40, airish.mouseY - 10);
        airish.fill(c, 255, 255);
        airish.quad(airish.mouseX - 60, airish.mouseY + 40, airish.mouseX - 40, airish.mouseY, airish.mouseX,
                airish.mouseY, airish.mouseX - 18, airish.mouseY + 30);
        airish.quad(airish.mouseX + 60, airish.mouseY + 40, airish.mouseX + 40, airish.mouseY, airish.mouseX,
                airish.mouseY, airish.mouseX + 10, airish.mouseY + 30);

        // moving background
        n -= 0.1f;
        if (n == -0.5f) {
            n = 1;
        }

        //
        a++;
    }// end render()

}// end main class


//Attempt of a recursive factoral tree
//TREE attempt, unfortunately couldn’t get it to run
//public void branches(double l, int depth)
    //{
        //if(l < 2 || depth > 10)
        //{
            //return;
       // }
        //airish.pushMatrix();
          //airish.rotate((float) angle*random(0.8,1.2));
          //airish.strokeWeight((float) (l * 0.2));
          //airish.line(0,0,(float) l,0);
           //airish.translate((float) l,0);
           //branches(l*reduction*random(0.8,1.2),depth + 1);
          //airish.popMatrix();
          //airish.pushMatrix();
          //airish.rotate((float)-angle*random(0.8,1.2));
          //airish.strokeWeight((float) (l * 0.2));
          //airish.line(0,0,(float) l,0);
          //airish.translate((float) l,0);
          //branches(l*reduction*random(0.8,1.2), depth + 1);
        //airish.popMatrix();
          

    //}


    //private float random(double d, double e) {
           //return 0;
       //}
   
       //public void trunk()
       //{
           //airish.strokeWeight((float)(len*0.2));
           //airish.stroke(0);
           //airish.line(0,0,len,0);
           //airish.pushMatrix();
              //airish.translate(len,0);
              //branches(len*reduction, 0);
           //airish.popMatrix();
       //}
   
       //public void display(float x, float y)
       //{
           //airish.pushMatrix();
             //airish.translate(x, y);
             //airish.rotate((float)(-0.5*PI));
             //trunk();
           //airish.popMatrix();
   
   
      // }
   
    
      // void render()
       //{
   
           //calulating average
           //float avg = 0;
          // for (int i = 0; i < ab.size(); i++)
           //{
               //avg += abs(ab.get(i));
           //}
           //avg = avg / ab.size();
           //float smoothedavg = 0;
           //smoothedavg = lerp(smoothedavg, avg, 0.1f);
   
           //make colours to music
           //float c = map(avg, -1, 1, 0, 255);
   
           //airish.background(0);//black background
   
           //airish.size(640, 360);
           //airish.frameRate(30);
           
   
          //draw butterfly
          //airish.stroke (255) ;
          //airish.strokeWeight(2);
       
          //airish.stroke (255) ;
          //airish.strokeWeight(3);
          //airish.fill(c, 255, 255);
          //airish.quad (airish.mouseX-60, airish.mouseY-70, airish.mouseX-10, airish.mouseY-50,airish.mouseX,airish.mouseY,airish.mouseX-40,airish.mouseY-10);
          //airish.quad (airish.mouseX+60, airish.mouseY-70, airish.mouseX+10, airish.mouseY-50, airish.mouseX, airish.mouseY, airish.mouseX+40, airish.mouseY-10);
          //airish.fill (c, 255, 255);
          //airish.quad (airish.mouseX-60, airish.mouseY+40, airish.mouseX-40,airish.mouseY, airish.mouseX, airish.mouseY, airish.mouseX-18, airish.mouseY+30);
          //airish.quad (airish.mouseX+60, airish.mouseY+40, airish.mouseX+40,airish.mouseY, airish.mouseX, airish.mouseY, airish.mouseX+10,airish.mouseY+30);
   
           //branches
           //branches(angle, a);
          
           //trunk of tree
           //trunk();
   
           //display
           //display(c, c);
   
   
   
          
           
       
           //moving the background 
           //n-=0.1f;
           //if(n==-0.5f)
           //{
               //n = 1;
   
           //}//end if
           
           //
           //a++;
   
           //drawing tree
           //calls the branch() to keep drawing it again
           //branch(120);
   
   
           //call branch function
           //branch(120);
       
           
       //}//end render()
       
   
   
   
   
           
   