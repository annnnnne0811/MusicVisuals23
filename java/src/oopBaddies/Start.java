package oopBaddies;

//Add imports here!!!
import ie.tudublin.Visual;


public class Start extends Visual{
    Anne anne = new Anne(this);

    int menu = 0;



    public void keyPressed()
    {
        if(key == '0')
        {
        }

        if(key == '1')
        {
        }
    }

    public void setup()
    {
        startMinim();
        loadAudio("fujisong.mp3");
        getAudioPlayer().play();
        
        colorMode(HSB);
    }

    public void draw()
    {
        switch (menu)
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
            background(0);
            anne.render();
            break;

    }

    }



}

