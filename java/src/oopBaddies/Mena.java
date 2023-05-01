package oopBaddies;

import ie.tudublin.Visual;

public class Mena extends Visual {

    Start mena;

    //constructor
    public Mena(Start mena)
    {
        this.mena = mena;

    }



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



        int color = color (255); 
        // making the yellow
        mena.fill(color);
        mena.noStroke();

        // creating the sun
        mena.ellipse(width + 200, height + 100 , 300 + (smoothedavg*600) , 300 + (smoothedavg*600));

        //drawing a house
        mena.fill(255, 200, 200);
        // width , height, width by lenght
        mena.rect(100, 300, 200, 300);

        //roof
        mena.fill(150, 150, 150);
        // triangle(x1, y1, x2, y2, x3, y3)
        mena.triangle(120, 200, 300, 200, 200, 100);

        mena.fill(0,100, 200);
        mena.rect(120, 120, 40, 40);
        mena.rect(120, 120, 40, 40);
        mena.rect(120, 120, 50, 40);
        mena.rect(170, 400, 40, 40);

        //door
        mena.fill(100, 50, 0);
        mena.rect(175, 435, 50, 86);



        // drawing the grass
        mena.fill(80, 200, 120); // set the fill color to green
        mena.noStroke(); // remove the stroke
        mena.rect(0, height +400, 600 ,200);

        int w = 1500;
        int h = 800;

        mena.fill(0, 10);
        mena.rect(0, 0 ,w , h);
        //representing the stars
        mena.fill(255);
        mena.noStroke();
        mena.ellipse(random(w), random(h), 5, 5);


    }





}