import java.util.Scanner; 

interface I1{
   void volume();
}
class A{
int l,b;
A(){
  l=15;
  b=18;
  } 
   void area(){
    int area=l*b;
 System.out.println("Rectangle Length is :"+l); 
 System.out.println("Rectangle Breadth is :"+b); 
 System.out.println("Area is :"+area); 
  }
}

class B extends A implements I1
{
   int l,b,h;
  B(){
  l=15;
  b=18;
  h=9;
}
public void volume()//interface I1 function 
{
 int vol =l*b*h;
System.out.println("Rectangle Length is :"+l); 
 System.out.println("Rectangle Breadth is :"+b); 
 System.out.println("Rectangle Height is :"+h); 

System.out.println("Vol is :"+vol); 
    }
  void perimeter(){
 int Perimeter=l*b;
 System.out.println("Rectangle Length is :"+l); 
 System.out.println("Rectangle Breadth is :"+b); 
 System.out.println("Perimeter is :"+Perimeter); 
  }
}

class multiple{
public static void main(String args[])
  {
    B obj=new B();
    obj.area();
    obj.perimeter();
    obj.volume();

    
  }
}