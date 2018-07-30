import java.io.*;

public class file {
public static void main(String args[]) throws IOException
{  int i;
   FileOutputStream fout=new FileOutputStream("MY-FIle.txt");    
    String s1="Hello friends this is how FIle HANDLING works using bit stream";
char ch[]=s1.toCharArray();
for(i=0;i<s1.length();i++)
{
fout.write(ch[i]);
}            
fout.close();    
System.out.println("success...");  
  
FileInputStream fin= new FileInputStream("MY-FIle.txt");
/*do{
i=fin.read();
if(i!=-1)
System.out.print((char)i);//type casting
}while(i!=-1);
*/
while((i=fin.read())!=-1){
System.out.print((char)i);//type casting
}
fin.close();
}
}