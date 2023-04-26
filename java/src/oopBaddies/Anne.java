package oopBaddies;
import java.nio.FloatBuffer;

import ie.tudublin.Visual;



public class Anne extends Visual{ //Start of Main

    Start anne;
    Float = 0;





    public Anne(Start anne) {
        this.anne = anne;
        cy = this.anne.height / 2;
    }


      


    //function to draw clouds
    public void cloud(int a, int b, int c, float d)
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

    


    //Start of Draw
    void render()
    {
        //calculating the average amplitude
        float avg = 0;
        for (int i = 0; i < ab.size(); i++)
        {
            avg += abs(ab.get(i));
        }
        avg = avg / ab.size();
        float smoothedavg = 0;
        smoothedavg = lerp(smoothedavg, avg, 0.1f);

        anne.colorMode(HSB);

        //The bigger the fill number the faster it goes
        anne.fill(0,10);
        anne.fill(255);
        anne.noStroke();


        //Making the circle bigger representing height and width
        if( anne.frameCount % 10 ==  00)
        {

            anne.ellipse(random(anne.width), random(anne.height), 5, 5);

        }
        //put 0,0 at centre
        anne.translate(anne.width/2, anne.height/2, 0);


        anne.colorMode(PApplet.HSB);
        for(int i = 0 ; i < anne.getAudioBuffer(); i++)
{
    anne.stroke(
        PApplet.map(i, 0, anne.getAudioBuffer(), 0, 155)
        , 300 
        , 350
    );

    anne.line(i, cy, i, cy + cy * anne.getAudioBuffer());
}



    
        //clouds
        cloud(-600, -544, 10, 10* smoothedavg*10);
        cloud(-800, -644, 10, 10* smoothedavg*10);
        cloud(-1000, -644, 10, 10* smoothedavg*10);
        cloud(-100, -544, 10, 10* smoothedavg*10);
        cloud(-300, -600, 10, 10* smoothedavg*10);
        cloud(0, -644, 10, 10* smoothedavg*10);


        //adding more cloud??
        cloud(1200, -544, 10, 10* smoothedavg*10);
        cloud(-400, -644, 10, 10* smoothedavg*10);
        cloud(50, -544, 10, 10* smoothedavg*10);


    }//end of render

 
}
