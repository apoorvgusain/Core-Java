import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="Layout_Examples.java" width="800" height="600">
</applet>*/

public class Layout_Examples extends Applet implements ActionListener
{
	Panel p_bl , p_gl , p_cl , p_fl;
	Button b1,b2,b3;
	CardLayout card;
	public void init()
	{
		card=new CardLayout();
		p_bl=new Panel(new BorderLayout());
		p_gl=new Panel(new GridLayout(2,2));
		p_fl=new Panel(new FlowLayout(FlowLayout.CENTER));
		p_cl=new Panel(card);
		b1=new Button("Card Layout b1");
		b2=new Button("Card Layout b2");
		b3=new Button("Card Layout b3");
		setLayout(null);
		p_bl.setBounds(0,0,400,400);
		p_cl.setBounds(0,400,400,200);
		p_fl.setBounds(400,400,400,400);
		p_gl.setBounds(400,0,400,400);
		p_bl.add(new Label("Top border"),BorderLayout.NORTH);
		p_bl.add(new Label("Left border"),BorderLayout.EAST);
		p_bl.add(new Label("center border"),BorderLayout.CENTER);
		p_bl.add(new Label("west border"),BorderLayout.WEST);
		p_bl.add(new Label("south border"),BorderLayout.SOUTH);
		p_fl.add(new Button("fl laout b1"));
		p_fl.add(new Button("fl laout b2"));
		p_fl.add(new Button("fl laout b3"));
		p_gl.add(new Button("GridLayout b1"));
		p_gl.add(new Button("GridLayout b2"));
		p_gl.add(new Button("GridLayout b3"));
		p_gl.add(new Button("GridLayout b4"));
		p_cl.add(b1);
		p_cl.add(b2);
		p_cl.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(p_cl);
		add(p_bl);
		add(p_fl);
		add(p_gl);
	}
	public void actionPerformed(ActionEvent ae)
	{
		card.next(p_cl);
	}
}