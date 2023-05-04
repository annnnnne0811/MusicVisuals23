package oopBaddies;
import ie.tudublin.Visual;
//import processing.core.PVector;
//import processing.core.PVector;

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
    //float theta;
    //float h;
    //tree(part2)
    float len = 100;
    double angle = 0.3;
    double reduction = 0.8;

    public void branches(double l, int depth)
    {
        if(l < 2 || depth > 10)
        {
            return;
        }
        airish.pushMatrix();
          airish.rotate((float) angle*random(0.8,1.2));
          airish.strokeWeight((float) (l * 0.2));
          airish.line(0,0,(float) l,0);
          airish.translate((float) l,0);
          branches(l*reduction*random(0.8,1.2),depth + 1);
        airish.popMatrix();
        airish.pushMatrix();
          airish.rotate((float)-angle*random(0.8,1.2));
          airish.strokeWeight((float) (l * 0.2));
          airish.line(0,0,(float) l,0);
          airish.translate((float) l,0);
          branches(l*reduction*random(0.8,1.2), depth + 1);
        airish.popMatrix();
          

    }

    private float random(double d, double e) {
        return 0;
    }

    public void trunk()
    {
        airish.strokeWeight((float)(len*0.2));
        airish.stroke(0);
        airish.line(0,0,len,0);
        airish.pushMatrix();
           airish.translate(len,0);
           branches(len*reduction, 0);
        airish.popMatrix();
    }

    public void display(float x, float y)
    {
        airish.pushMatrix();
          airish.translate(x, y);
          airish.rotate((float)(-0.5*PI));
          trunk();
        airish.popMatrix();


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

        //airish.size(640, 360);
        //airish.frameRate(30);
        

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

        //branches
        branches(angle, a);
       
        //trunk of tree
        trunk();

        //display
        display(c, c);



       
        
    
        //moving the background 
        //n-=0.1f;
        //if(n==-0.5f)
        //{
            //n = 1;

        //}//end if
        
        //
        //a++;

        //drawing tree
        //calls the branch() to keep drawing it again
        //branch(120);


        //call branch function
        //branch(120);
    
        
    }//end render()
    

}//end main class
    
