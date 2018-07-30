import java.util.Scanner;
public class mystring {
public static void main(String args[]){
String str1,str2;
System.out.println("Enter the string");
Scanner sc= new Scanner(System.in);
str1=sc.nextLine();

System.out.println("Enter the second string");
str2=sc.nextLine();
System.out.println("");

System.out.println("First and Second strings are equal :"+str1.equals(str2));
System.out.println("First string Length"+str1.length());
System.out.println("Second string Length"+str2.length());
System.out.println("Compare both strings (0-equals,Positive-first>second,Negative- first<second ):"+str1.compareTo(str2));
System.out.println("Second string using SUBSTRING method "+str2.substring(3,5));

System.out.println("string is trimed with no space in the end"+str1.trim());

}//end of main
}//end of class
