import java.lang.*;
public class AutoBoxing
{
       public static void main(String [ ] args)
       {
              int num = 200;
              Integer i = num;
              Integer j = Integer.valueOf(num);
              System.out.println("num = " + num +" , i = " + i + " , j = " + j);
          }
} 