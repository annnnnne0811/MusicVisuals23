package oopBaddies;

//Add imports here!!!
import ie.tudublin.Visual;


public class Start extends Visual{
    Anne anne = new Anne(this);
    Airish airish = new Airish(this);
    Paris paris = new Paris(this);

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
            background(0);
            fill(135,206,250);
            textAlign(CENTER);
            textSize(width/20.0f);
            

            //Title
            text("Shinunoga E-wa by Fujii Kaze", width/2.0f, height/3.0f);
            textSize(width/30.0f);


            //Menu Options
            text("Press 1: Anne", width/2.0f, (height/3.0f) + 60);
            text("Press 2: Airish", width/2.0f, (height/3.0f) + 120);
            text("Press 3: Mena", width/2.0f, (height/3.0f) + 180);
            text("Press 4: Paris", width/2.0f, (height/3.0f) + 240);

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
            break;


            //Paris 
            case 4:
            background(color(255, 192, 203, 200));
            paris.render();
            break;
            

    }
    }


}

