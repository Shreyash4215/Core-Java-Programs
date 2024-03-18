
import java.applet.*;
import java.awt.*;

//<applet code=app2 width=1200 height=700></applet>

public class app2 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawOval(500,250,200,200);
	}
}
