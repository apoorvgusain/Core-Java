import java.util.Scanner; 

class account
{
int accNo;
double balance;
String name,accName;
account()
{
accNo=98746;

name="sita";

accName="current";

balance=80000;

System.out.println(" Account No. :" + accNo );
    System.out.println(" Name : "+name);
    System.out.println(" Account Type: "+accName);
    System.out.println(" Balance: "+ balance);}

account(int accNo,String accName,String name,double balance)
{
this.accNo=accNo;

this.name=name;

this.accName=accName;

this.balance=balance;

System.out.println(" Account No. :" + this.accNo );
    System.out.println(" Name : "+this.name);
    System.out.println(" Account Type: "+this.accName);
    System.out.println(" Balance: "+ this.balance);
}
}



class constructorOver{
   public static void main(String args[])
    {
        account obj=new account();
        account obj2=new account(1234,"saving","ram",50000);


    }
}