import java.util.Scanner; 

class countObj
{
static int count;
double l,b,h;
countObj(double l,double b,double h)
{
this.l=l;
this.b=b;
this.h=h;
count++;
}

public static void count(){
System.out.println("the no of objects"+ count);
}

void area(){
double area=l*b*h;
System.out.println("the area is "+ area);

}
}


class countingObj{
   public static void main(String args[])
    {
        countObj obj1=new countObj(2,15,9);
        countObj obj2=new countObj(12,15,9);
        countObj obj3=new countObj(2,5,19);
        countObj obj4=new countObj(12,5,19);
       obj1.area();
obj2.area();
obj3.area();
obj4.area();
countObj.count();
}
}