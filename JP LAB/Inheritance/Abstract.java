abstract class bank
{
  abstract int getROI();
}
class SBI extends bank
{
   int getROI()
   {
      return 7;
    }
}
class Axis extends bank
{
   int getROI()
   {
      return 9;
    }
}
class ICICI extends bank
{
   int getROI()
   {
      return 12;
    }
}
class Abstract
{
   public static void main(String args[])
   {
      bank b;
      b = new SBI();
      System.out.println(+ b.getROI() + "%");
       b = new Axis();
      System.out.println(+ b.getROI() + "%");
       b = new ICICI();
      System.out.println(+ b.getROI() + "%");
    }
}