package oopBaddies;

import ie.tudublin.Visual;

public class Mena extends Visual {

    Start mena;

    //constructor
    public Mena(Start mena)
    {
        this.mena = mena;

    }

    // varaible for rocket
    int y = 700;

    void render()
    // start of the render
    {
        //calulate average
        float avg = 0;
        for (int i = 0; i < ab.size(); i++)
        {
            avg += abs(ab.get(i));
        }
        avg = avg / ab.size();
        float smoothedavg = 0;
        smoothedavg = lerp(smoothedavg, avg, 0.1f);

        mena.colorMode(RGB);

        // varaible for the stars
        int w = 2000;
        int h = 900;

        mena.fill(0, 10);
        mena.rect(0, 0 ,w , h);

        //represent the stars
        mena.fill(255);
        mena.noStroke();
        mena.ellipse(random(w), random(h), 5, 5);

        int color = color (255); 
    
        mena.fill(color);
        mena.noStroke();

        // create the moon and matching the beat of the moon
        mena.ellipse(width + 200, height + 100 , 300 + (smoothedavg*600) , 300 + (smoothedavg*600));

        //draw a house
        mena.fill(173, 216, 230);
        mena.rect(100, 600, 300, 300);

        //draw the roof
        mena.fill(139, 69, 19); // color grey
        mena.triangle(100, 600, 250, 400, 400, 600);


        // draw the window 
        mena.fill(0, 0, 0); // color black
        mena.rect(150, 656, 40, 50); // making the first window
        mena.rect(300, 656, 40, 50); // making the second window

        mena.fill(0, 0, 0); //
        mena.rect(200, 800, 100, 200);

        // draw the door 
        mena.fill(200, 200, 200);
        mena.rect(200, 800, 30, 100);


        // draw the grass
        mena.fill(80, 200, 120); // set the fill color to green
        mena.noStroke(); // remove the stroke
        mena.rect(0, 900, 2000 ,120);     

         //draw a rocket
         mena.translate(CENTER, CENTER);
         mena.fill(255);
         mena.triangle(950, y+100, 1000, y-10, 1050, y+100); // bottom of the rocket
        //an oval shape of the rocket and moving the rocket up
         mena.ellipse(w/2, y,100,200);
         mena.fill(175, 100, 220);
        //two circle windows on the rocket and moving the rocket up
        // the two cicrle also represent the beat of the music
         mena.ellipse(w/2, y+10, 50+(smoothedavg*300), 50);
         mena.ellipse(w/2, y-50, 40+(smoothedavg*200),40);
         mena.fill(0);
         mena.ellipse(w/2, y+10, 40,40);
         mena.ellipse(w/2, y-50, 30,30);
         mena.ellipse(0, 80, 40, 20); // Draw the engine of the rocket
        
        // move the rocket
        y--;

        if(y < 0){
            y = 700;
        }

        //draw a street lights near the house
        mena.translate(200, 595); // move the street light the bottom of the screen
        mena.fill(200);
        mena.rect(350, 100, 20, 200);
        mena.ellipse(360, 90, 40+ (smoothedavg*200), 40); // make the circle of the light which will match the beat of the music
        
        mena.fill(255, 240, 200);
        mena.ellipse(360, 90, 20+ (smoothedavg*300), 20); // make the circle of the light which will match the beat of the music
        mena.strokeWeight(3);
        mena.stroke(255, 240, 200);
        mena.line(345, 90, 375, 90);

        mena.fill(0, 204, 204); // set the color the blue
        mena.noStroke();
  
        // Draw the pond
        mena.ellipse(1000, 400, 450+ (smoothedavg*600), 200); // draw the pond of the water

        mena.fill(102, 102, 102); // Settting the  color to gray
        mena.ellipse(750, 350, 30+(smoothedavg*600) , 30); // draw a small rock
        mena.ellipse(1250, 350, 40+ (smoothedavg*600), 40); // draw a larger rock
        mena.ellipse(1400, 380, 60+ (smoothedavg*600), 60); // draw a medium rock
        
        // drawing a bigger version of the street light
        mena.fill(200); // setting the color to grey
        mena.rect(1500, 100, 20, 200); // draw the pole of the street light
        
        // drawing the head of the street light
        mena.fill(255, 255, 204); // sett the color to yellow
        mena.ellipse(1500, 80, 80+(smoothedavg*200), 80); // draw the head of the street light
        
        // Draw the lamp light
        mena.fill(255, 255, 204, 200); // set the semi-circle to the color yellow
        mena.ellipse(1500, 80, 50+(smoothedavg*200), 50);
        mena.stroke(255, 255, 204); // set the color stroke to yellow

 
    } // end of the render





}