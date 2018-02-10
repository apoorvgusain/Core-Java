import java.util.Scanner; 

class myAccount
{
int accNo;
double balance;
String name;
String accName;
myAccount()
{
Scanner obj=new Scanner(System.in);

System.out.println("enter the Account no :");
accNo=obj.nextInt();

System.out.println("enter the account name :");
accName=obj.next();

System.out.println("enter the balance :");
balance=obj.nextDouble();

System.out.println("enter the name :");
name=obj.next();

System.out.println("The given data is  Account No. :");

    System.out.println(" Account No. :" + accNo );
    System.out.println(" Name : "+name);
    System.out.println(" Account Type: "+accName);
    System.out.println(" Balance: "+ balance);
   

}

   void withdrawal(double withdraw)
   {
    balance=balance-withdraw;
    
   }
   
   void deposit(double dpost)
   {
    balance=balance+dpost;
   } 
   
   void display()
   {
    System.out.println(" Account No. :" + accNo );
    System.out.println(" Name : "+name);
    System.out.println(" Account Type: "+accName);
    System.out.println(" Balance: "+ balance);
   
   }
 

}



public class account
{
   public static void main(String args[])
    { double amt;

      Scanner obj=new Scanner(System.in);
      myAccount acc=new myAccount();
      System.out.println("enter the amount  to withdraw :");
      amt=obj.nextDouble();
      acc.withdrawal(amt);
      acc.display();
      System.out.println("enter the amount  to deposit :");
      amt=obj.nextDouble();
      acc.deposit(amt);
      acc.display();
    }
}