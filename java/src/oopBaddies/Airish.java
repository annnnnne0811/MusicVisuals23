package oopBaddies;
import ie.tudublin.Visual;

//main class
public class Airish extends Visual {

    Start airish;
    //constructor
    public Airish(Start start) {
        this.airish = start;
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

        airish.colorMode(RGB);


        //mountains
        airish.triangle(45,400,500,400,250,50);
        airish.triangle(100,400,500,400,400,20);

        //bird left side of sky
        airish.stroke(0);
        airish.line(200,80,160,100);
        airish.line(160,80,160,100);

        //sun in sky
        airish.translate(40,80);
        airish.fill(245, 187, 87);
        airish.stroke(245, 187, 87);
        airish.push();
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
        airish.pop();
        airish.noFill();

        //bird uppper right in sky
        airish.translate(450,-7);
        airish.line(200,80,160,100);
        airish.line(160,80,160,100);



    }




    
}//end main class
