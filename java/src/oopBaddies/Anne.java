package oopBaddies;

import ie.tudublin.Visual;

//Start of the main 
public class Anne extends Visual
//start of the main
{
    Start anne;

    public Anne(Start anne)
    //start of public Anne
    {
        this.anne = anne;

    //End of the public anne
    }



    //function to draw the clouds 
    public void cloud(int a , int b, int c, float d)
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
    
    }//End of fucntion to draw the clouds



    //function to draw the ground
    public void ground(int a, int b, int c, int d)
    {
        anne.fill(170, 150, 146, 240);
        anne.rect(0, 900, 2000, 120);

    }//End of funtion to draw ground



    //funtion to draw the sun 
    //ellipse(x-co, y-co, width, height)
    public void sun(float a, float b)
    {
        anne.ellipse(224, 184, 220, 220);

    }//end of the function to draw the sun 



    //Start of the draw render 
    void render()
    {
        //Calculating the average amplitude 
        float avg = 0; 
        for(int i = 0; i < ab.size(); i++)
        {
            avg += abs(ab.get(i));
        }
        avg = avg / ab.size();
        float smoothedavg = 0;
        smoothedavg = lerp(smoothedavg, avg, 0.01f);

        anne.colorMode(HSB);

        anne.fill(0,10);
        anne.fill(255);
        anne.noStroke();

        //making the circle bigger representing the height anf width
        if( anne.frameCount % 30 ==  00)
        {
            anne.ellipse((anne.width), (anne.height), smoothedavg, smoothedavg);
        }

        anne.translate(anne.width/2, anne.height/2,0);

        //renders the clouds 
        cloud(-600, -544, 10, 10* smoothedavg*30);
        cloud(-800, -644, 10, 10* smoothedavg*30);
        cloud(-1000, -644, 10, 10* smoothedavg*30);
        cloud(-100, -544, 10, 10* smoothedavg*30);
        cloud(-300, -600, 10, 10* smoothedavg*30);
        cloud(0, -644, 10, 10* smoothedavg*30);



        //render the ground
        ground(0, 530, 600, 530);



        //renders the sun 
        sun(224, 184);

    



    }//End of the void render



}//End of the main 