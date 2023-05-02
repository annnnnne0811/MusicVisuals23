package oopBaddies;

import ie.tudublin.Visual;

public class Mena extends Visual {

    Start mena;

    //constructor
    public Mena(Start mena)
    {
        this.mena = mena;

    }

    int y = 700;
    boolean flicker=true;

    void render()
    {
        //calulating average
        float avg = 0;
        for (int i = 0; i < ab.size(); i++)
        {
            avg += abs(ab.get(i));
        }
        avg = avg / ab.size();
        float smoothedavg = 0;
        smoothedavg = lerp(smoothedavg, avg, 0.1f);

        mena.colorMode(RGB);

        int w = 2000;
        int h = 900;

        mena.fill(0, 10);
        mena.rect(0, 0 ,w , h);
        //representing the stars
        mena.fill(255);
        mena.noStroke();
        mena.ellipse(random(w), random(h), 5, 5);

        int color = color (255); 
    

        mena.fill(color);
        mena.noStroke();

        // creating the moon
        mena.ellipse(width + 200, height + 100 , 300 + (smoothedavg*600) , 300 + (smoothedavg*600));

        //drawing a house
        mena.fill(173, 216, 230);
        mena.rect(100, 600, 300, 300);

        //drawing the roof
        mena.fill(139, 69, 19); // color grey
        mena.triangle(100, 600, 250, 400, 400, 600);


        // drawing the window 
        mena.fill(0, 0, 0); // color black
        mena.rect(150, 656, 40, 50); // making the first window
        mena.rect(300, 656, 40, 50); // making the second window

        //drawing the backgroud
        mena.fill(0, 0, 0); //
        mena.rect(200, 800, 100, 200);

        // drawing the door 
        mena.fill(200, 200, 200);
        mena.rect(200, 800, 30, 100);



        // drawing the grass
        mena.fill(80, 200, 120); // set the fill color to green
        mena.noStroke(); // remove the stroke
        mena.rect(0, 900, 2000 ,120);     

         //Drawing a rocket
         mena.translate(CENTER, CENTER);
         mena.fill(255);
         mena.triangle(950, y+100, 1000, y-10, 1050, y+100); // bottom of the rocket
        //an oval shape of the rocket and moving the rocket up
         mena.ellipse(w/2, y,100,200);
         mena.fill(175, 100, 220);
        //two circle windows on the rocket and moving the rocket up
         mena.ellipse(w/2, y+10, 50+(smoothedavg*300), 50);
         mena.ellipse(w/2, y-50, 40+(smoothedavg*200),40);
         mena.fill(0);
         mena.ellipse(w/2, y+10, 40,40);
         mena.ellipse(w/2, y-50, 30,30);
         mena.ellipse(0, 80, 40, 20); // Draw the engine of the rocket
        
        // moving the rocket
        y--;

        if(y < 0){
            y = 700;
        }

        //drawing a street lights
        mena.translate(200, 595); // moving the street light the bottom of the screen
        mena.fill(200);
        mena.rect(350, 100, 20, 200);
        mena.ellipse(360, 90, 40+ (smoothedavg*200), 40);
        
        mena.fill(255, 240, 200);
        mena.ellipse(360, 90, 20+ (smoothedavg*300), 20);
        mena.strokeWeight(3);
        mena.stroke(255, 240, 200);
        mena.line(360, 80, 360, 30);
        mena.line(345, 90, 375, 90);
        mena.line(360, 100, 360, 150);

        mena.fill(0, 204, 204); // Set the fill color to dark blue
        mena.noStroke(); // Turn off the stroke
  
        // Draw the pond
        mena.ellipse(1000, 400, 450+ (smoothedavg*600), 200); // Draw the main body of water

        mena.fill(102, 102, 102); // Set the fill color to gray
        mena.ellipse(750, 350, 30+(smoothedavg*600) , 30); // Draw a small rock
        mena.ellipse(1250, 350, 40+ (smoothedavg*600), 40); // Draw a larger rock
        mena.ellipse(1400, 380, 60+ (smoothedavg*600), 60); // Draw a medium rock
        
        // Draw the lamp post pole
        mena.fill(200); // Set the fill color to light gray
        mena.rect(1500, 100, 20, 200); // Draw the pole rectangle
        
        // Draw the lamp head
        mena.fill(255, 255, 204); // Set the fill color to light yellow
        mena.ellipse(1500, 80, 80+(smoothedavg*200), 80); // Draw the head ellipse
        
        // Draw the lamp light
        mena.fill(255, 255, 204, 200); // Set the fill color to semi-transparent light yellow
        mena.ellipse(1500, 80, 50+(smoothedavg*200), 50); // Draw the light ellipse
        mena.stroke(255, 255, 204); // Set the stroke color to light yellow


    }





}