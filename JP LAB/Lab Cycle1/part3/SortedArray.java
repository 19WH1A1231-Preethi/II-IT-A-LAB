import java.util.Scanner;
import java.util.Arrays;
public class SortedArray
{
   public static void main(String args[])
   {
      int n,temp=0;
      Scanner s = new Scanner(System.in);
     
      System.out.println("Enter number of elements:");
      n = s.nextInt();
      int[] a = new int[n];
      System.out.println("Enter all the elements:");
      for(int i = 0; i < n ; i++)
      {
            a[i] = s.nextInt();
       }
       Arrays.sort(a);
       System.out.println("Elements in Sorted order:");
       for(int i = 0; i < a.length ; i++)
      {
            System.out.println(a[i]);
       }
    }
}
      
    