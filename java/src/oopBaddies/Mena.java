package oopBaddies;

import ie.tudublin.Visual;
import jogamp.nativewindow.windows.RGBQUAD;

public class Mena extends Visual {

    Start mena;

    //constructor
    public Mena(Start mena)
    {
        this.mena = mena;

    }

        int y = 700;

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
        // making the yellow
        mena.fill(color);
        mena.noStroke();

        // creating the sun
        mena.ellipse(width + 200, height + 100 , 300 + (smoothedavg*600) , 300 + (smoothedavg*600));

        //drawing a house
        mena.fill(255, 200, 200);
        // width , height, width by lenght
        mena.rect(100, 600, 300, 300);

        //roof
        mena.fill(150, 150, 150);
        mena.triangle(100, 600, 250, 400, 400, 600);

        //door
        mena.fill(255, 0, 255);
        mena.rect(200, 800, 100, 200);


        // drawing the grass
        mena.fill(80, 200, 120); // set the fill color to green
        mena.noStroke(); // remove the stroke
        mena.rect(0, 900, 2000 ,120);


         //Drawing a rocket
         mena.translate(CENTER, CENTER);
         mena.fill(255);
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

        // drawing a street lights
        mena.translate(200, 595); // movig the street light the bottom of the screen
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

    
    }





}