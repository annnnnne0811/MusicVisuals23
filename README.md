# Music Visualiser Project

Name:			Student Number:  

Mary Anne Flores || C20461582

Mena Nguyen		 || C20418324

Airish Reyes	 || C20477044

Paris Le		 || C20401536



# Description of the assignment

The theme we concluded for this assigment was "what we feel when we listen to the song" 


The song we choose to do for this assignment is a japanese song called "Shinunoga E-wa" by Fujii Kaze, the literal translation for "Shinunoga E-wa" is "I'd rather die", the song is based about how the artist Fuji cant live without the ones he loves. This song is a chill pop song to listen to, the visualizer assignment we did is based on our thoughts and what suited the vibe of the song.


To achieve this goal, we made a menu that gives the user 4 options 1. Anne, 2.Airish, 3.Mena, 4.Paris , by pressing one of the options it will bring you to one of the programmers thoughts about the song. 


# Instructions

The user will be presented with a menu containing options 1-4. This will allow the user to enter a key from 1-4 to choose which type design that they would like to see.

Press 1 - Anne, which shows 

Press 2 - Airish, which shows a butterfly that moves with the cursor and a floral background which goes with the music sounds. The colour of the floral background also changes after the first time you press the key to start it.

Press 3 - Mena, which shows a house with street lights that has grass and a pond with rocks around it that will react to the beat of the music that we chooose, with a rocket moving up to the moon

Press 4 - Paris, which has a moving blue ocean wave and the moon in the middle that reacts to music, as well as two rainbow shifting color hearts on the side of the screen and a little plane that flies across the screen and loops around. A rainbow pixel-like static appears on the screen at random to reflect a retro aesthetic vibe. 

# How it works

To run this project you wil need Visual Studio Code, and make sure to have the relevant Java Libraries and Processing Labraries installed for it to run
properly. To start this project you will need to press the FN-F5 and then the program will run which will show you main screen with a list of options
or visualisers for you to watch and it will start playing the song

We made a folder called 'oopBaddies' inside the src folder. Inside the folder, we all made java files for each visualiser. After that we made a
filed called 'Start.java' which has a switch statement allowing to access each java file that was needed depending on which key was pressed. Then, we called this file in Main.java to be able to excute the code. We did this by importing the oopBaddies folder.

```Java
import oopBaddies.*;

```
Visual.java has a subclass called Start.java. This states that we can use the minim libraries that is called in Visual.java. This allows us to play our song.

```Java
import ddf.minim.*;
import ddf.minim.analysis.FFT;

```

We also created instance for each of the visualiser in our package, to be able to call the render methods that exist within.

```Java
public class Start extends Visual{
    Anne anne = new Anne(this);
    Airish airish = new Airish(this);
    Mena mena = new Mena(this);
    paris paris = new paris(this);
}
```

Below you can see the example of the keyPressed method being used to handle the cases within the switch statement. The integer value stored in key will react to the same corresponding number in the switch statement.

```Java
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

```

Then setup() method will play the song with the visualisers

```Java
public void setup()
    {
        startMinim();
        loadAudio("fujisong.mp3");
        getAudioPlayer().play();
        
        colorMode(HSB);
    }

```

Then, in the switch statement  each visualiser render() method is called.

```Java
//Anne 
case 1:
 background(153, 204, 255);
anne.render();
break;


//Airish
case 2:
background(0);
airish.render();
break;

```









# What I am most proud of in the assignment

Airish - Despite the difficulties I encountered, what I am most proud of is being persevering. As I attempted other drawings like a recursive factoral tree and node growing tree etc. As well as that, getting most of the floral pattern for the background as it took a lot of trial and error to figure out the co-ordinates that will work. I found that it was also pleasing to see the butterfly and the background go with the music.

Anne - 

Mena - Even thought there were diffcult moment during this assignment, What i was most proud about doing this assignment was doing the house as it was diffcult at the start because the roof didn't want to go it co oridnates but i wish i couldve something better and add something to the house , but in the end i solved the problem with the help of my team, also making all the ellipse mathing to the beat of the muisc was the most proud part and also making the rocket moving up to the sky. I am very happy with outcome in the end.

Paris - Although there were some stressful moments during the project, which caused me to have many breakdowns due to the code not working correctly and the screen size being off, our team was able to create some fantastic processing sketches that showcased our creativity and teamwork. Despite the challenges, I was eventually able to correct my code, the most challenging part of the code was resizing the blue wave, it was really difficult to modify the size at the begining and while it didn't turn out exactly as I had hoped, the resulting visuals were suprisingly great, and I'm quite satisfied with the outcome.

Working with all the shapes, colors, and different functions was enjoyable and enlightening. I'm especially proud of the effort and dedication put forth by everyone on our team, which helped make our project outstanding and appealing. This assignment has taught me so many valuable lessons, and I feel grateful and proud to have been a part of such a great team. 

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

```Java

```