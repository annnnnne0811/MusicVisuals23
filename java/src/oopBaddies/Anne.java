package oopBaddies;

import ie.tudublin.Visual;

//Start of the main 
public class Anne extends Visual
//start of the main
{
    Start anne;


    int flowerX;
    int flowerY;

    public Anne(Start anne)
    //start of public Anne
    {
        this.anne = anne;

        //used to make the flower add more circles for the flower petals
        frameCount = 0;

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
    //rect(x-co, y-co, width, height)
    public void ground()
    {
        anne.stroke(114, 180, 58);
        anne.fill(65, 101, 34);
        anne.rect(0, 850, 2000, 500);

    }//End of funtion to draw ground



    //funtion to draw the sun 
    //ellipse(x-co, y-co, width, height)
    public void sun()
    {
        anne.pushMatrix();
        anne.smooth();
        anne.noSmooth();


        
      //anne.translate(width/2, height/2);
      //rotates the sun for real this time   PLEASE
      // float angle = radians(frameCount % 360); 
      //anne.rotate(angle);

        anne.fill(245,187,87);
        anne.ellipse(224, 184, 220, 220);


        anne.popMatrix();

    }//end of the function to draw the sun 



    //Funtion to draw the flower 
    public void flowers()
    {

        //flower 1
        //makes the flower rotate without affecting the background
        anne.pushMatrix();
        anne.smooth();
        anne.noSmooth();

        //rotates the flower
        anne.frameRate(1);
        frameCount++;

        anne.translate(anne.width/2, anne.height/2);
        anne.translate(-100,100);

        //makes the flower rotate maybe this time???
        anne.rotate(radians(frameCount + flowerX));



        //draws the flower petals
        anne.stroke(246, 204, 213);
        anne.fill(246, 204, 213);
        for(int i = 0; i < 5; i++)
        {
            //ellipse(x-co, y-co, width, height)
            anne.ellipse(0 , -40, 50, 50);
            anne.rotate(radians(72));
        }

        //the center of the flower
       // anne.stroke(173, 174, 179);
        anne.fill(173, 174, 179);
        anne.ellipse(0,0,50,50);

        //stem
        //so the line doesnt rotate with the flower 
        anne.pushMatrix();
        //anne.translate(0,0);
        anne.rotate(-radians(frameCount + flowerX));
    
        anne.stroke(41, 63, 22);
        anne.strokeWeight(3);
        anne.line(0, 15, 0,255);

        //end of stem popMatrix()
        anne.popMatrix();





        //end of the pushMatrix
        anne.popMatrix();


        //flower 2
        //makes the flower rotate without affecting the background
        anne.pushMatrix();
        anne.smooth();
        anne.noSmooth();

        //rotates the flower
        anne.frameRate(5);
        frameCount++;

        anne.translate(anne.width/2, anne.height/2);
        anne.translate(-400,50);

        //makes the flower rotate maybe this time???
        anne.rotate(radians(frameCount + flowerX));

        //draws the flower petals
        anne.stroke(242, 137, 151);
        anne.fill(242, 137, 151);
        for(int i = 0; i < 5; i++)
        {
            //ellipse(x-co, y-co, width, height)
            anne.ellipse(0 , -40, 50, 50);
            anne.rotate(radians(72));
        }

        //the center of the flower
        anne.stroke(173, 174, 179);
        anne.fill(173, 174, 179);
        anne.ellipse(0,0,50,50);


        //stem
        //so the line doesnt rotate with the flower 
        anne.pushMatrix();
        //anne.translate(0,0);
        anne.rotate(-radians(frameCount + flowerX));
    
        anne.stroke(41, 63, 22);
        anne.strokeWeight(3);
        anne.line(0, 15, 0,255);

        //end of stem popMatrix()
        anne.popMatrix();

    

        //end of the pushMatrix
        anne.popMatrix();






    } //End of the funtion to draw the flower 



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

        anne.colorMode(RGB);

        //renders the sun 
        sun();




        //renders the flower maybe??
        flowers();




        //render the ground
        ground();



        //render for the clouds 
        anne.fill(0,10);
        anne.fill(255);
        anne.noStroke();

        //making the circle bigger representing the height anf width
        if( anne.frameCount % 30 ==  00)
        {
            anne.ellipse((anne.width),(anne.height), smoothedavg, smoothedavg);
        }

        anne.translate(anne.width/2, anne.height/2,0);

        //renders the clouds 
        cloud(-600, -544, 10, 20* smoothedavg*200);
        cloud(-800, -644, 10, 20* smoothedavg*200);
        cloud(-1000, -644, 10, 20* smoothedavg*200);
        cloud(-100, -544, 10, 20* smoothedavg*200);
        cloud(-300, -600, 10, 20* smoothedavg*200);
        cloud(0, -644, 10, 20* smoothedavg*200);







    }//End of the void render



}//End of the main 