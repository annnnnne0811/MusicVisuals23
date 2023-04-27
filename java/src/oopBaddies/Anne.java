package oopBaddies;

import ie.tudublin.Visual;

//Start of the main
public class Anne extends Visual
{
    Start anne;


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




    //Start of the draw 
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
    }

//End of main
}