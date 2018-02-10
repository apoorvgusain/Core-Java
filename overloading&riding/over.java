import java.util.Scanner; 

/*overloading*/

class loading
{
void area(int l,int b)
{
int area=l*b;
System.out.println("Rectangle Area is: "+ area);
}
void area(int s)
{
int area=s*s;
System.out.println(" Square Area is: " +area);
 }
}

/*overriding*/

class riding
{
void calculate(int l,int b)
{
int result=l*b;
System.out.println("Super class result is: " +result);
}
}

class  subclass extends riding
{

void calculate(int x,int y)
{super.calculate(x,y);
int result=x+y;
System.out.println("Subclass result is: " +result);
}

}

class over{
public static void main(String args[])
{
loading obj=new loading();
obj.area(5,4);
obj.area(8);
subclass obj2=new subclass();
obj2.calculate(8,5);
}
}