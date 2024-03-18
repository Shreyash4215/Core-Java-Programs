import java.util.*;
import java.applet.*;
import java.awt.*;

//<applet code=Ass37R width=1200 height=600></applet>

public class Ass37Applet_R extends Applet implements Runnable
{
	int x1=200,y1=200,x2=200,y2=400;
	static int flag=0;
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
				Thread.sleep(500);
				if(flag==0)
				{
					x1=200;
					y1=200;
					x2=300;
					y2=200;
				}
				
				if(flag==1)
				{
					x1=300;
					y1=200;
					x2=300;
					y2=300;
				}
				
				if(flag==2)
				{
					x1=300;
					y1=300;
					x2=200;
					y2=300;
				}
				if(flag==3)
				{
					x1=200;
					y1=300;
					x2=300;
					y2=400;
				}
				
				
				repaint();
				if(flag==3)
					System.exit(0);
				flag++;				
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
		g.drawLine(x1,y1,x2,y2); //x1,y1,x2,y2
	}
}
