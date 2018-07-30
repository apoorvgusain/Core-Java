import java.applet.*; 
import java.awt.*;
/*
<applet code="moving.java" width="400" height="400" ></applet> */

public class moving extends Applet implements Runnable
{
String msg="hello this is moving ";
Thread t=null;
boolean stopflag;
public void init()
{
setBackground(Color.green);

setForeground(Color.white);

}
 
public void start()
{t=new Thread(this);
stopflag=false;
t.start();
}
public void run()
 { char ch;
 for(;;){
try{repaint();
Thread.sleep(200);
ch=msg.charAt(0);
msg=msg.substring(1,msg.length());
msg+=ch;
if(stopflag)
break;
}
catch(InterruptedException e){}}  
}
public void stop(){
stopflag=true;
t=null;
}
public void paint(Graphics g){
g.drawString(msg,100,100);}
}