import java.util.Scanner; 

class byvalue
{
  void value(int x,int y)
{
     x=x+10;
     y=y*2;
}

}
class byref
{int p,q;
byref(int x,int y){
p=x;
q=y;
}
  void ref(byref obj)
{
     p=obj.p+10;
    q=obj.q*2;
}

}

class callby{
   public static void main(String args[])
    {
        byvalue obj1=new byvalue();
 int a=2,b=4;           
System.out.println("CALL BY VALUE:- ");

System.out.println("the value of A: "+ a);
System.out.println("the value of B: "+ b);      
        obj1.value(a,b);
System.out.println("the value of A: "+ a);
System.out.println("the value of B: "+b);      

byref obj2=new byref(8,4);

System.out.println("CALL BY REFERENCE:- ");

System.out.println("the value of A: "+ obj2.p);
System.out.println("the value of B: "+ obj2.q);      
obj2.ref(obj2);
System.out.println("the value of A: "+ obj2.p);
System.out.println("the value of B: "+ obj2.q);      
}
}