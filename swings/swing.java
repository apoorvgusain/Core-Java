import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swing
{String ch;  

 public static void main(String args[]){

  JFrame f=new JFrame();
 JButton b1=new JButton("1");
 JButton b2=new JButton("2"); 
JButton b3=new JButton("3");
JButton b4=new JButton("+");
 JButton b5=new JButton("4"); 
JButton b6=new JButton("5");
 JButton b7=new JButton("6");
 JButton b8=new JButton("-");  
JButton b9=new JButton("7");
 JButton b10=new JButton("8");
 JButton b11=new JButton("9"); 
 JButton b12=new JButton("/");
JButton b13=new JButton("."); 
JButton b14=new JButton("0");
 JButton b15=new JButton("=");
 JButton b16=new JButton("*"); 


 JTextField tf=new  JTextField();
tf.setText(ch);
tf.setBounds(10,20,270,50);
 b1.setBounds(10,80,60,50);
 b2.setBounds(80,80,60,50);
 b3.setBounds(150,80,60,50);
 b4.setBounds(220,80,60,50);

 b5.setBounds(10,150,60,50);
 b6.setBounds(80,150,60,50);
 b7.setBounds(150,150,60,50);
 b8.setBounds(220,150,60,50);

 b9.setBounds(10,220,60,50);
 b10.setBounds(80,220,60,50);
 b11.setBounds(150,220,60,50);
 b12.setBounds(220,220,60,50);

 b13.setBounds(10,290,60,50);
 b14.setBounds(80,290,60,50);
 b15.setBounds(150,290,60,50);
 b16.setBounds(220,290,60,50);

f.add(tf); 
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b10);
f.add(b11);
f.add(b12);
f.add(b13);
f.add(b14);
f.add(b15);
f.add(b16);
b1.addActionlistener(this);
b2.addActionlistener(this);
b3.addActionlistener(this);
b4.addActionlistener(this);
b5.addActionlistener(this);
b6.addActionlistener(this);
b7.addActionlistener(this);
b8.addActionlistener(this);
b9.addActionlistener(this);
b10.addActionlistener(this);
b11.addActionlistener(this);
b12.addActionlistener(this);
b13.addActionlistener(this);
b14.addActionlistener(this);
b15.addActionlistener(this);
b16.addActionlistener(this);


 f.setLayout(null);
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setSize(300,500); 

}//main ends here

 void actionPerformed(ActionEvent a)
{
 String str=a.getActionCommand();
if(str=="1")
{ch="1";}
else if(str=="2"){ch="2";}
else if(str=="3"){ch="3";}
else if(str=="4"){ch="4";}
else if(str=="5"){ch="5";}

else if(str=="6"){ch="6";}
else if(str=="7"){ch="7";}
else if(str=="8"){ch="8";}
else if(str=="9"){ch="9";}

else if(str=="0"){ch="0";}
else if(str=="+"){ch="+";}
else if(str=="-"){ch="-";}
else if(str=="*"){ch="*";}

else if(str=="/"){ch="/";}
else if(str=="="){}
else if(str=="."){ch=".";}

}//actionperformed ends here

}//ends swing class 