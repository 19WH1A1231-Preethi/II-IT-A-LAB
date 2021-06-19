interface bank
{
  final int sc = 8;
  abstract int getROI();
}
class SBI implements bank
{
   public int getROI()
   {
      return 7;
    }
}
class Axis implements bank
{
   public int getROI()
   {
      return 9;
    }
}
class ICICI implements bank
{
   public int getROI()
   {
      return 12;
    }
}
class Interface
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