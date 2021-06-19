import java.lang.*;
public class AutoUnboxing
{
      public static void main(String[ ] args)
     {
              Integer number = 150;
              int p = number;
              int q = number.intValue();
              System.out.println("number = " + number + ", p = " +  p + ", q =  " + q);
}
}  