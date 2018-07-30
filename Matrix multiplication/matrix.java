import java.util.Scanner;
class matrix
{
public static void main(String []args)
{
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter the no of rows");
int row=sc.nextInt();

 System.out.println("Enter the no of column");
 int col=sc.nextInt();

 int [][] a=new int[row][col];
 int [][] b=new int[row][col];
 
System.out.println("Enter the first array");
for (int i = 0; i < row; i++)
{
   for (int j = 0; j <col; j++)
    {
     a[i][j]=sc.nextInt();
    }
}//entering array 2 elements

System.out.println("Enter the second array");

for (int i = 0; i < row; i++)
 {
  for (int j = 0; j <col; j++)
    {
      b[i][j]=sc.nextInt();
    }
  }//entering array 2 elements

//adding two matrix
if(a.length==b.length)
{
  for (int i = 0; i < row; i++)
    {
  for (int j = 0; j <col; j++)
      {
       a[i][j]*=b[i][j];
      }
    }
}

else{
         System.out.println("array size is not equal"); 

    }//if-else ends 

 for (int i = 0; i < row; i++)
    {
for (int j = 0; j <col; j++)
          {
   
         System.out.println("Element at index [" + i+"]["+j + "] : "+ a[i][j]);      }    
    }//display loop


 }
}