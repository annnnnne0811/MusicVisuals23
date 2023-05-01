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

        mena.colorMode(HSB);

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
        // triangle(x1, y1, x2, y2, x3, y3)
        mena.triangle(100, 600, 300, 400, 300, 100);

        //door
        mena.fill(255, 0, 255);
        mena.rect(200, 800, 100, 200);


        // drawing the grass
        mena.fill(80, 200, 120); // set the fill color to green
        mena.noStroke(); // remove the stroke
        mena.rect(0, 900, 2000 ,120);

        // car
        
        // float carX = 0;

        // carX += 1;

        // mena.pushMatrix();
        // mena.translate(carX, 200);
        // mena.fill(255, 0, 255);
        // mena.rect(0, 0, 100, 50);
        // mena.rect(10, -20, 50, 20);
        // mena.rect(60, -20, 30, 20);
        // mena.fill(0, 0, 255);
        // mena.ellipse(25, 50, 20, 20);
        // mena.ellipse(75, 50, 20, 20);
        // mena.popMatrix();


         //Drawing a rocket
         mena.translate(CENTER, CENTER);
         mena.fill(255);
        //an oval shape of the rocket and moving the rocket up
         mena.ellipse(w/2, y,100,200);
         mena.fill(175, 100, 220);
        //two circle windows on the rocket and moving the rocket up
         mena.ellipse(w/2, y+10, 50+(smoothedavg*300), 50+(smoothedavg*300));
         mena.ellipse(w/2, y-50, 40,40);
         mena.fill(0);
         mena.ellipse(w/2, y+10, 40,40);
         mena.ellipse(w/2, y-50, 30,30);

        // moving the rocket
        y--;
        
        if(y < 0){
            y = 700;
        }


        



    }





}