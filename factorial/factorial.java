 class factorial
{
  public static void main(String args[])
   {
    int num=5;
    int factorial = fact(num);
    System.out.println("Factorial of 5 is: "+factorial);
   }
static int fact(int n)
   {
       int result;
       if(n==1)
       {
         return 1;
       }
       
       result= fact(n-1)* n;
       return result;
   }

}