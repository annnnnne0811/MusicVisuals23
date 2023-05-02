package oopBaddies;

import java.util.ArrayList;

import ie.tudublin.Visual;

//Start of the main
public class Anne extends Visual
{
    Start anne;


    ArrayList<flower> particles = new ArrayList<flower>();

    public Anne(Start anne)
    {
        this.anne = anne;
        frameCount = 0;
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

    public void flower(float a, float b, float c, float d)
    {


        //draws the flowers hopfully

        //centre
        //makes the flower rotate without affecting the others in the background 
        anne.pushMatrix();
        anne.smooth();
        anne.noSmooth();

        //rotates the flower
        anne.frameRate(15);
        frameCount++;

        anne.translate(mouseX, mouseY);

       //hopfully rotates the flower
       anne.rotate(radians(frameCount + mouseX));

       //draws the petals 
       anne.fill(211, 169, 130);
       for(int i = 0; i < 5; i++)
       {
            anne.ellipse(0, -40, 50, 50);
            anne.rotate(radians(72));
       }

       //the center circle of the flower
       anne.fill(246, 191, 170);
       anne.ellipse(0,0,50,50);

    }//End of  render 



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
        cloud(-600, -544, 10, 10* smoothedavg*10);
        cloud(-800, -644, 10, 10* smoothedavg*10);
        cloud(-1000, -644, 10, 10* smoothedavg*10);
        cloud(-100, -544, 10, 10* smoothedavg*10);
        cloud(-300, -600, 10, 10* smoothedavg*10);
        cloud(0, -644, 10, 10* smoothedavg*10);



        //draws the flowers hopfully

        //centre
        //makes the flower rotate without affecting the others in the background 
        anne.pushMatrix();
        anne.smooth();
        anne.noSmooth();

        //rotates the flower
        anne.frameRate(15);
        frameCount++;

        anne.translate(mouseX, mouseY);

       //hopfully rotates the flower
       anne.rotate(radians(frameCount + mouseX));

       //draws the petals 
       anne.fill(211, 169, 130);
       for(int i = 0; i < 5; i++)
       {
            anne.ellipse(0, -40, 50, 50);
            anne.rotate(radians(72));
       }

       //the center circle of the flower
       anne.fill(246, 191, 170);
       anne.ellipse(0,0,50,50);

    }//End of  render 


//End of main
}