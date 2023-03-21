package oopBaddies;

//Add imports here!!!
import ie.tudublin.Visual;


public class Start extends Visual{
    Anne anne = new Anne(this);

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
            background(0);
            fill(135,206,250);
            textAlign(CENTER);
            textSize(width/20.0f);
            
            //Title
            text("Shinunoga E-wa by Fujii Kaze", width/2.0f, height/3.0f);
            textSize(width/30.0f);


            //Menu Options
            text("Press 1: Anne ", width/2.0f,(height/30.0f)+60);
            

            break;



            //Anne 
            case 1:
            background(0, 0, 20);
            anne.render();
            break;
    }

    }



}

