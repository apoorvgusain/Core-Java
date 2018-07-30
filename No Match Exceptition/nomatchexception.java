import java.util.Scanner; 
import java.io.*;
class nomatchexception{
public static void main(String args[])
  { Scanner obj=new Scanner(System.in);
     String s1,s2="india";
     System.out.println("Enter the string"); 
    s1 =obj.nextLine();   
try{
   if(s1.equals(s2)){
              System.out.println("Entered string is Equal"); 
       }
   else{
          throw new IOException(s1);
      }
    } 
 catch(IOException e){
  System.out.println("Entered String Is Not Equal" );
    
   }   
  }
}