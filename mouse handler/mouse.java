import java.applet.*; 
import java.awt.*;
import java.awt.event.*;

/*<applet code="mouse" width=400 height=500></applet>*/

public class mouse extends Applet implements MouseListener,MouseMotionListener
{
String msg="";
int x=0,y=0;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent e)
{
x=50;
y=100;
msg="mouse is clicked";
repaint();
}

public void mousePressed(MouseEvent e)
{
x=100;
y=100;
msg="mouse is Pressed";
repaint();
}

public void mouseReleased(MouseEvent e)
{
x=e.getX();
y=e.getY();
msg="mouse is Released";
repaint();
}

public void mouseEntered(MouseEvent e)
{
x=120;
y=100;
msg="mouse is Entered";
repaint();
}

public void mouseExited(MouseEvent e)
{
x=120;
y=100;
msg="mouse is Exited";
repaint();
}
 
public void mouseDragged(MouseEvent e)
{
x=e.getX();
y=e.getY();
showStatus("mouse is dragged at x: "+ x +"y:"+y);
repaint();
}
public void mouseMoved(MouseEvent e)
{
x=e.getX();
y=e.getY();
showStatus("mouse is dragged at x: "+ x +"y: "+y);
repaint();
}
public void paint(Graphics g){
g.drawString(msg,x,y);}
}