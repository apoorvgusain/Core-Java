import java.util.Scanner; 
import java.io.IOException;
class A{
   int l,b;
  A(){
  l=5;
  b=8;
  }
  void rectangle(){
    int area=l*b;
 System.out.println("Rectangle Length is :"+l); 
 System.out.println("Rectangle Breadth is :"+b); 
 System.out.println("Area is :"+area); 
  }
}

class B extends A
{
   int l,b;
  B(){
  super();
  l=15;
  b=18;
  }
  void rectangle(){
  
 int Perimeter=l*b;
 System.out.println("Rectangle Length is :"+l); 
 System.out.println("Rectangle Breadth is :"+b); 
 System.out.println("Perimeter is :"+Perimeter); 
  }
}

class polymorphism{
public static void main(String args[])
  {
   A obj1=new A();
   B obj2=new B();
   A ref;
ref=obj1;
  ref.rectangle();

ref=obj2;
  ref.rectangle();
    
  }
}