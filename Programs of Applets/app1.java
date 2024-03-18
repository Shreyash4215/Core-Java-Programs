
import java.applet.*;
import java.awt.*;

//<applet code=app1 width=1200 height=700></applet>

public class app1 extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("Demo of Applet",100,100);
	}
}
