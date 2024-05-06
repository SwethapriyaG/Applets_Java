//Program to demonstrate applets

import java.applet.*;
import java.awt.*;
@SuppressWarnings("deprecation")

public class MyApp extends Applet
{
	String msg = "";
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.green);
		msg+="init-->";
		
		this.add(new Label("Hello Java"));
		this.add(new Button("Click me"));
	}
public void start()
	{
		msg+="start-->";
	}
public void stop()
	{
		msg+="stop-->";
	}
public void destroy()
	{
		msg+="destroy-->";
	}	
	public void paint(Graphics g)
	{
		g.drawLine(30,60,500,200);
		g.drawString(msg,100,200);
		
	}
}	