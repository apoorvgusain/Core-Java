import java.util.Scanner; 
import java.lang.ArithmeticException;


class exception{
public static void main(String args[])
  {      int a,b,c;
    Scanner obj=new Scanner(System.in);
   double result;
  System.out.println("Dividend:");
   a=obj.nextInt();  
  System.out.println("Divisor:");
   b=obj.nextInt();  
    
  try{
     result=a/b;
     System.out.println("Result:"+result);
     }
   catch(ArithmeticException e)
   {
    System.out.println("division by zero");
    result=1;
    System.out.println("Default result:"+result);
   }
 finally {
System.out.println("This Ends Here");  
}
 } 
}