public class stringClass{
public static void main(String[] args)
    {
String str1=new String("this is string");
String str2=new String("this is string");
String str3;
str3=str1;
System.out.print("str1==str2?? ");
System.out.println( str1 == str2);
System.out.println("str1.equals(str2)?? "+str1.equals(str2));
System.out.println("str3.equals(str2)?? "+str3.equals(str2));
System.out.print("str1==str3?? ");
System.out.print(str1 == str3);

}
}