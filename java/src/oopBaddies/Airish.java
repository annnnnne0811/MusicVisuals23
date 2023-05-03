package oopBaddies;
import ie.tudublin.Visual;
//import processing.core.PVector;
import processing.core.PVector;

//main class
public class Airish extends Visual {

    Start airish;


    //constructor

    public Airish(Start airish) 
    {
        this.airish = airish;
    }

    //declaring variables 
    int i=1;
    int j=1;
    int n=300;
    int a=1;
    float theta;

    public void setup()
    {
        size(640, 360);
    }

    public void draw()
    {
        frameRate(30);
        stroke(255);

        float a = (mouseX / (float) width) * 90f;
        theta = radians(a);
        translate(width/2, height);
        line(0,0,0,-120);
        translate(0,-120);
        branch(120);

    }

    void branch(float h)
    {
        h *= 0.66;

        if(h > 2)
        {
            pushMatrix();
            rotate(theta);
            line(0, 0, 0, -h);
            translate(0, -h);
            branch(h);
            popMatrix();

            pushMatrix();
            rotate(-theta);
            line(0,0,0, -h);
            translate(0, -h);
            branch(h);
            popMatrix();

        }//end if
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

        //make colours to music
        float c = map(avg, -1, 1, 0, 255);

        airish.background(0);//black background

        //call branch function
        branch(c);
        

       //draw butterfly
       airish.stroke (255) ;
       airish.strokeWeight(2);
    
       airish.stroke (255) ;
       airish.strokeWeight(3);
       airish.fill(c, 255, 255);
       airish.quad (airish.mouseX-60, airish.mouseY-70, airish.mouseX-10, airish.mouseY-50,airish.mouseX,airish.mouseY,airish.mouseX-40,airish.mouseY-10);
       airish.quad (airish.mouseX+60, airish.mouseY-70, airish.mouseX+10, airish.mouseY-50, airish.mouseX, airish.mouseY, airish.mouseX+40, airish.mouseY-10);
       airish.fill (c, 255, 255);
       airish.quad (airish.mouseX-60, airish.mouseY+40, airish.mouseX-40,airish.mouseY, airish.mouseX, airish.mouseY, airish.mouseX-18, airish.mouseY+30);
       airish.quad (airish.mouseX+60, airish.mouseY+40, airish.mouseX+40,airish.mouseY, airish.mouseX, airish.mouseY, airish.mouseX+10,airish.mouseY+30);
        
    
        //moving the background 
        n-=0.1f;
        if(n==-0.5f)
        {
            n = 1;

        }//end if
        
        //
        a++;

        
    }//end render()
    

}//end main class
    
