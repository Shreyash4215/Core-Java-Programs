
import java.applet.*;
import java.awt.*;

//<applet code=Ass40_2in1 width=1200 height=650></applet>

public class Ass40Applet_2in1 extends Applet implements Runnable
{
	int x=100,y=100,p=500,s=100,flg=1,l=230,m=230,z=0;
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
				Thread.sleep(200);
				
				
					x=x+10;
					p=p-10;					
					y=y+10;
					s=s+10;
				
				if(y==310)
				{
					z=y;
					x=1500;
					p=1500;
					y=0;
					flg=0;
				}
				if(flg==0)
				{
					m=m-10;
				}
				repaint();			
			}
		}
		catch(Exception ex){}
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(x,y,100,100);
		g.setColor(Color.GREEN);
		g.fillOval(p,s,100,100);
		if(z==310)
		{
			g.setColor(Color.YELLOW);
			g.fillOval(l,m,222,222);			
		}
	}
}
