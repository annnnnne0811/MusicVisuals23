package oopBaddies;

import ie.tudublin.Visual;

//Start of the main
public class Anne extends Visual
{
    Start anne;

    //Variables for the rain 
    int rain = 100 ;    //this will give a random amount of rain instead of it being limited
    float [] xPos = new float[rain];
    float [] yPos= new float[rain];
    float [] speed = new float [rain];    //speed for the rain 
    Rain [] drop;



    public Anne(Start anne)
    {
        this.anne = anne;
        
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





        //for the flowers

        anne.pushMatrix();
        anne.smooth();
        anne.noSmooth();
        anne.frameRate(15);
    
        anne.background(179, 158, 181);
        anne.translate(width/2, height/2);
        anne.rotate(radians(frameCount));
    
        //Draws 5 petal, rotating after one 
        anne.fill(128, 128, 0);
        for( int i = 0; i < 5; i++);
        {
            anne.ellipse(0, -40, 50, 50);
            anne.rotate(radians(72));               
    
        }
    
        //centre circle
        anne.fill(255,255,0);
        anne.ellipse(0,0, 50, 50);
    
        anne.popMatrix();
        

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





    }//End of  render 


//End of main
}