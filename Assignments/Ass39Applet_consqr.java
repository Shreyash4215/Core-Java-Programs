import java.util.*;
import java.applet.*;
import java.awt.*;

//<applet code=Ass39consqr width=1200 height=650></applet>

public class Ass39Applet_consqr extends Applet implements Runnable
{
	int x1=600,y1=300,x2=575,y2=300,i=250,p=625,l=325,m=550,flag=0;
	
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
					x1=x2;
					y1=y2;
					x2=x2;
					y2=y2-25;
				}
				
				if(flag==1)
				{
					x1=x2;
					y1=y2;
					x2=p;
					y2=y2;
				}
				
				if(flag==2)
				{
					x1=x2;
					y1=y2;
					x2=x2;
					y2=l;
				}
				if(flag==3)
				{
					x1=x2;
					y1=y2;
					x2=m;
					y2=y2;
				}
				if(flag==4)
				{
					x1=x2;
					y1=y2;
					x2=x2;
					y2=i;
				}
				flag++;
				if(flag==5)
				{
					i=i-25;
					p=p+25;
					l=l+25;
					m=m-25;
					flag=1;
				}	
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
		g.drawLine(x1,y1,x2,y2); //x1,y1,x2,y2
	}
}
