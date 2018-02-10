import java.util.Scanner; 

interface I 
{
 void volume();
}

class subclass implements I
{double l,b,h;
subclass(double p,double q,double r)
{l=p;
b=q;
h=r;
}
public void volume()
{
double result= l*b*h;
System.out.println("Length is: " +l);
System.out.println("Breadth is: " +b);
System.out.println("Height is: " +h);

System.out.println("Result is: " +result);
}
}

class interfaceClass
{
public static void main(String args[])
{
System.out.println("Interface");
subclass obj=new subclass(8,18,13);
obj.volume();
}
}