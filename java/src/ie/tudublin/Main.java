package ie.tudublin;
import oopBaddies.*;


public class Main
{	

	public void start()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Start());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.start();			
	}
}