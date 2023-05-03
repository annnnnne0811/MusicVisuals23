package oopBaddies;

//import java.util.ArrayList;

import ie.tudublin.Visual;

//Start of the main
public class Anne extends Visual
{
    Start anne;

    int flowerX;
    int flowerY;

    int frameCount1 = 0;
    int frameCount2 = 0;

    //for the sun 
    float sunRotation = 0;




    int rain = 0;


    public Anne(Start anne)
    {
        this.anne = anne;
        frameCount = 0;
        frameCount1 = 0;
        frameCount2 = 0;



        
    }

    //fucntion to draw the clouds
    public void cloud(int a, int b ,int c , float d)
    {
        anne.noStroke();
        anne.fill(255);
        anne.ellipse(a+530, b+295, c+60, d+30);
        anne.ellipse(a+510, b+305, c+40, d+30);
        anne.ellipse(a+460, b+295, c+40, d+30);
        anne.ellipse(a+480, b+305, c+40, d+30);
        anne.ellipse (a+470, b+285, c+40, d+30);
        anne.ellipse (a+510, b+285, c+40, d+30);
        anne.ellipse (a+490, b+280, c+40, d+30);
    }

    //draw the ground
    public void ground(int a, int b, int c, int d)
    {
        
        anne.fill(170, 150, 146, 240);
        anne.rect(0, 900, 2000, 120);

    }


    
    //Start of the draw render
    void render()
    {
        //calculating the everage amplitude
        float avg = 0;
        for(int i = 0; i < ab.size(); i++)
        {
            avg+= abs(ab.get(i));
        }
        avg = avg / ab.size();
        float smoothedavg = 0;
        smoothedavg = lerp(smoothedavg, avg , 0.1f);

        anne.colorMode(HSB);
        

        //sun
        //sun(-100,100);

        //flower
        //flower(-200,0);
  
        //the ground
        ground(0,530,600,530);




        //The bigger the fill the faster it goes
        anne.fill(0,10);
        anne.fill(255);
        anne.noStroke();

        //Making the circle bigger representing height and width
        if( anne.frameCount % 30 ==  00)
        {
            anne.ellipse((anne.width), (anne.height), smoothedavg, smoothedavg);
        }

        anne.translate(anne.width/2, anne.height/2,0);

        //the clouds
        cloud(-600, -544, 10, 10* smoothedavg*30);
        cloud(-800, -644, 10, 10* smoothedavg*30);
        cloud(-1000, -644, 10, 10* smoothedavg*30);
        cloud(-100, -544, 10, 10* smoothedavg*30);
        cloud(-300, -600, 10, 10* smoothedavg*30);
        cloud(0, -644, 10, 10* smoothedavg*30);

        //potential sun
        anne.pushMatrix();
        anne.smooth();
        anne.noSmooth();

        //rotates the sun 
       // anne.frameRate(15);
     //  frameCount++;

       // anne.translate(500, 500);

        //this hopefully rotates the sun
   //     anne.rotate(radians(sunRotation));
        anne.strokeWeight(2);
        anne.fill(255);
 
        anne.rotate(radians(sunRotation));
        anne.ellipse(224, 184, 220, 220);

        anne.popMatrix();


        sunRotation += 0.20;
    }//End of  render 


//End of main
}