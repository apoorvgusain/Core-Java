import java.util.Scanner; 
class fibonacii{
public static void main(String args[])
{
int first=0,second=1,third,size;
Scanner obj=new Scanner(System.in);
System.out.println("enter the size :");
size=obj.nextInt();
System.out.println("The given size is  :" + size);
System.out.print("The fibonacii series is : " + first +" " +second);
  
for(int i=1;i<=size;++i)
   {
third=first+second;
  System.out.print(" " + third);   
    first=second;
second=third;}
}
}