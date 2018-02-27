import java.util.*; 
import java.lang.Thread;
class even implements Runnable
{
 public void run()
 {
    for(int i=0;i<=20; i++)
    { if((i%2)==0)
      {
      System.out.println(i+" is even.");
       }
    }
 }

}
class odd implements Runnable
{
 public void run()
 {
    for(int i=0;i<=20; i++)
    { if((i%2)!=0)
      {
      System.out.println(i+" is odd.");
       }
    }
 }

}


class oddeven{
public static void main(String[] args)
    {
     
Thread obj1= new Thread(new even());
Thread obj2= new Thread(new odd());
obj1.start();
obj2.start();
}
}