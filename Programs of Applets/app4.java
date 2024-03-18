
import java.applet.*;
import java.awt.*;

//<applet code=app4 width=1200 height=700></applet>

public class app4 extends Applet implements Runnable
{
	int x=500,y=250,flg=1;
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
				Thread.sleep(50);
				
				if(flg==1)
					x=x+10;
				else 
					x=x-10;
				
				if(x==1000)
					flg=2;
				if(x==0)
					flg=1;
				
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
