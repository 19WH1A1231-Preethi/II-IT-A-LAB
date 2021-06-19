//ASSIGNMENT-2
class StringBufferDemo
{
  public static void main(String args[])
  {
     StringBuffer s1 = new StringBuffer("Java");  
     StringBuffer s2 = new StringBuffer("Programming");
     //StringB s3 = "    hello";
     StringBuffer s4 = new StringBuffer("hello");
   
     int n;
   
   System.out.println("addings strings: " + s1.append(s2));
   System.out.println("Length: "+ s2.length());
   System.out.println("Character at index: " + s1.charAt(3));
   System.out.println("Inserting: " + s1.insert(0,"Hello"));
   System.out.println("Deleting: "+ s1.delete(0,2));
   System.out.println("Deleting a char: "+ s2.deleteCharAt(6));
   System.out.println("Reverse:  "+ s2.reverse());
   System.out.println("Index of: "+ s1.indexOf("a"));
   System.out.println("Last index: "+ s1.lastIndexOf("v"));
   System.out.println("substring: "+ s2.substring(2,5));
   System.out.println("Capacity: "+ s4.capacity());
   System.out.println("Replacing"+ s1.replace(0,1,"hi"));

 }
}
