package oopBaddies;
import ie.tudublin.Visual;
//import processing.core.PVector;

//main class
public class Airish extends Visual {

    Start airish;

    //ferriswheel
    float z = 0;

    //constructor

    public Airish(Start airish) 
    {
        this.airish = airish;
    }

    public void mount(int a, int b, int c, float d)
    {
            //bird left side of sky
            airish.stroke(0);
            airish.line(200,80,160,100);       
            airish.line(160,80,160,100);

            //bird upper right in sky
            airish.translate(450,-7);
            airish.line(200,80,160,100);
            airish.line(160,80,160,100);

            //mountains
            airish.triangle(45,400,500,400,250,50);
            airish.triangle(100,400,500,400,400,20);
            
    }




    void render()
    {
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
    
            airish.colorMode(RGB);
        }




         //mountains
         mount(45,400,500,400);




        //bird left side of sky
        airish.line(200,80,160,100);
        airish.line(160,80,160,100);
        
        //sun in sky
        airish.pushMatrix();
        
        airish.translate(40,80);
        airish.fill(245, 187, 87);
        airish.stroke(245, 187, 87);


  
        airish.translate(500,40);
        airish.rotate(radians(frameCount / 2));
        airish.ellipse(0, 0, 60, 60);
        airish.line(0, -60, 0, -40);
        airish.line(0, 40, 0, 60);
        airish.line(-45, -45, -30, -30);
        airish.line(45, -45, 30, -30);
        airish.line(-60, 0, -40, 0);
        airish.line(40, 0, 60, 0);
        airish.line(-45, 45, -30, 30);
        airish.line(45, 45, 30, 30);

        
        airish.popMatrix();
        airish.noFill();
        
        //bird upper right in sky
        airish.translate(450,-7);
        airish.line(200,80,160,100);
        airish.line(160,80,160,100);











         //ferriswheel
        // ferriswheel(0,0,200,200);
       //  mount(-100,400,500,400 );

        //borderline colour of mountains
        airish.stroke(211);
        //inside colour of mountains
        airish.fill(255);

        airish.pushMatrix();

        //airi
        //main wheel of ferriswheel
        airish.ellipse(0, -40, 50, 50);

        //frame
        airish.triangle(0,0,75,130,-75,130);

        airish.popMatrix();

        //Spokes in wheel
        for(int i = 0; i < 18; i++)
        {
            airish.rotateZ(PI/9);
            airish.line(0,0,0,100);
        }

        //carriages from ferris wheel
        for(int j = 0; j<6; j++)
        {
            airish.pushMatrix();
            airish.rotate(PI/3);
            airish.translate(0,100,0);
            airish.rotate(-z);
            
            airish.rotateZ(radians(-60*j));
            airish.rotateZ(radians(-60));
            airish.fill(10,150,255);
            airish.triangle(0,0,5,10,-5,10);
            airish.fill(255,150,10);

            airish.popMatrix();
            airish.rotate(z);
            airish.translate(0, 900, 0);

           // airish.popMatrix();
        }

        z = z-(PI/700);
        println("X: " + mouseX + " Y: " + mouseY);








        
    
    }

    
}//end main class
