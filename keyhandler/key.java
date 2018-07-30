import java.applet.*; 
import java.awt.*;
import java.awt.event.*;
/*<applet code="key" width=400 height=500></applet>*/
public class key extends Applet implements KeyListener
{
String msg="";
int x=50,y=50;
public void init()
{
addKeyListener(this);
requestFocus();
}

public void keyTyped(KeyEvent e)
{
msg+=e.getKeyChar();
repaint();
}

public void keyPressed(KeyEvent e)
{
showStatus("key down");
}

public void keyReleased(KeyEvent e)
{
showStatus("key released");
}

public void paint(Graphics g){
g.drawString(msg,x,y);
}

}