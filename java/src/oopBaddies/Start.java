package oopBaddies;

//Add imports here!!!
import ie.tudublin.Visual;


public class Start extends Visual{
    Anne anne = new Anne(this);
    Airish airish = new Airish(this);
    Mena mena = new Mena(this);
    paris paris = new paris(this);

    //For menu buttons
    int mode = 0;



    public void keyPressed()
    {
        if(key == '0')
        {
            mode = 0;
        }

        if(key == '1')
        {
            mode = 1;
        }

        if(key == '2')
        {
            mode = 2;
        }

        if(key == '3')
        {
            mode = 3;
        }

        if(key == '4')
        {
            mode = 4;
        }
    }

    public void setup()
    {
        startMinim();
        loadAudio("fujisong.mp3");
        getAudioPlayer().play();
        
        colorMode(HSB);
    }


    public void settings()
    {
        size(600, 600, P3D);
    }



    public void draw()
    {
        switch (mode)
        {
        //for the main menu
        case 0:
            background(color(204, 217, 255));
            fill(135,206,250);
            textAlign(CENTER);
            textSize(width/20.0f);
            

            //Title
            fill(255);
            text("Shinunoga E-wa by Fujii Kaze\n\n", width/2.0f, height/3.0f);
            textSize(width/25.0f);


            //Menu Options
<<<<<<< HEAD
            text("Press 1:Anne", width/2.0f, (height/3.0f) + 60);
            text("Press 2:Airish", width/2.0f, (height/3.0f) + 120);
            text("Press 3:Mena", width/2.0f, (height/3.0f) + 180);
            text("Press 4:Paris", width/2.0f, (height/3.0f) + 240);            
=======
            text("Press 1: Anne", width/2.0f, (height/3.0f) + 60);
            text("Press 2: Airish", width/2.0f, (height/3.0f) + 120);
            text("Press 3: Mena", width/2.0f, (height/3.0f) + 180);
            text("Press 4: Paris", width/2.0f, (height/3.0f) + 240);


            pushMatrix();

            smooth();
            noSmooth();
            frameRate(15);
        
            background(179, 158, 181);
            translate(width/2, height/2);
            rotate(radians(frameCount));

            //Draws 5 petal, rotating after one 
            fill(128, 128, 0);
            for( int i = 0; i < 5; i++);
            {
                ellipse(0, -40, 50, 50);
                rotate(radians(72));               

            }

            //centre circle
            fill(255,255,0);
            ellipse(0,0, 50, 50);

            popMatrix();

>>>>>>> ebd65671e447fedf962e21408f5b7dc3e770b79e

            break;


            //Anne 
            case 1:
            background(153, 204, 255);
            anne.render();
            break;


            //Airish
            case 2:
            background(175, 213, 240);
            airish.render();
            break;


            //Mena
            case 3:
            background(0);
            mena.render();
            break;


            //Paris 
            case 4:
            background(color(255, 192, 203, 200));
            paris.render();
            break;
            

    }
    }


}

