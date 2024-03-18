import java.util.*;
import java.applet.*;
import java.awt.*;

//<applet code=app5 width=1200 height=600></applet>

public class app5 extends Applet implements Runnable
{
	Random obj;
	int x=500,y=250,flg=1;
	Thread t;
	
	public void init()
	{
		obj = new Random();
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.sleep(50);
				
				if(flg==1)
					x=x+200;
				else 
					x=x-200;
				
				if(x==1100)
					flg=2;
				if(x==-100)
					flg=1;
				
				repaint();			
			}
		}
		catch(Exception ex){}
	}
	
	public void paint(Graphics g)
	{
		update(g);
	}

	public void update(Graphics g)
	{
		g.setColor(getClr());
		g.fillOval(x,y,200,200);
	}
	
	public Color getClr()
	{
		int r = obj.nextInt(255);
		int g = obj.nextInt(255);
		int b = obj.nextInt(255);
		
		Color c = new Color(r,g,b);
		return c;
	}
}
