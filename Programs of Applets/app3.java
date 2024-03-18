
import java.applet.*;
import java.awt.*;

//<applet code=app3 width=1200 height=700></applet>

public class app3 extends Applet implements Runnable
{
	int x=500,y=250;
	Thread t;
	
	public void init()
	{
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.sleep(100);
				x=x+10;
				
				if(x==1000)
					x=0;
				
				repaint();			
			}
		}
		catch(Exception ex){}
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(x,y,200,200);
	}
}
