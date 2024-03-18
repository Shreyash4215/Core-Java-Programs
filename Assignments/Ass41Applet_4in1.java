
import java.applet.*;
import java.awt.*;

//<applet code=Ass41_4in1 width=1200 height=650></applet>

public class Ass41Applet_4in1 extends Applet implements Runnable
{
	int x=100,y=100,p=500,s=100,flg=1,l=100,m=100,z=0,a=100,b=500,c=500,d=500,v=300,f=300;
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
					a=a+10;
					c=c-10;	
					y=y+10;
					b=b-10;
					d=d-10;
					s=s+10;
				
				if(y==310)
				{
					z=y;
					x=1500;
					p=1500;
					a=1500;
					c=1500;
					y=0;
					flg=0;
				}
				if(flg==0)
				{
					l=l+10;
					m=m+10;
					v=v-5;
					f=f-5;
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
		g.setColor(Color.BLUE);
		g.fillOval(a,b,100,100);
		g.setColor(Color.YELLOW);
		g.fillOval(c,d,100,100);
		if(z==310)
		{
			g.setColor(Color.BLACK);
			g.fillOval(v,f,l,m);			
		}
	}
}