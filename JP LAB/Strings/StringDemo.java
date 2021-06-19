//ASSIGNMENT-1
import java.util.*;
class StringDemo
{
  public static void main(String args[])
  {
     String s1 = "HELLO";  
     String s2 = "world";
     String s3 = "    hello";
     String s4 = "hello";
     char ch = s1.charAt(4);
     int n;
   
   System.out.println("concat: " + s1.concat(s2));
   System.out.println("Length: "+ s2.length());
   System.out.println("Character at index: " + s1.charAt(3));
   System.out.println("compare: " + (n=s1.compareTo(s3)));
   System.out.println("Equals: "+ s1.equals(s2));
   System.out.println("Starts with: "+ s2.startsWith("w"));
   System.out.println("Ends with:  "+ s2.endsWith("hi"));
   System.out.println("Index of: "+ s1.indexOf("E"));
   System.out.println("Last index: "+ s1.lastIndexOf("O"));
   System.out.println("changing to lower case: "+ s1.toLowerCase());
   System.out.println("changing to Upper case: "+ s2.toUpperCase());
   System.out.println("Removing empty spaces: "+ s3.trim());
   
   String a[] = s1.split("");
   System.out.println("splitting the String:");
   for(int i = 0; i < a.length; i++)
   {
      System.out.println(a[i]);
   }
   System.out.println("Replacing"+ s1.replace("L","P"));
   System.out.println(s1.equalsIgnoreCase(s4));
 }
}
