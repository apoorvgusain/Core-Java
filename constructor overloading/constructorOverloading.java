import java.util.Scanner; 


class rectangle 
{
double l,b,d;
rectangle()
{
l=7;
b=8;
d=6;
}
rectangle(double x,double y,double z)
{
l=x;
b=y;
d=z;
}

public void volume()
{
double result= l*b*d;
System.out.println("result is: " +result);
}

}

class subclass extends rectangle
{
double weight;
subclass()
{
super();
weight=50;
}
subclass(double p,double q,double r,double w)
{
super(p,q,r);
weight=w;
}

}

class constructorOverloading
{

public static void main(String args[])
{
subclass obj=new subclass();
subclass obj2=new subclass(8,18,13,40);
obj.volume();
System.out.println("Default weight is: " +obj.weight);
obj2.volume();
System.out.println("Default weight is: " +obj2.weight);

}

}