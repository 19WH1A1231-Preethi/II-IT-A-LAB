class main
{
  public static void main(String args[])
  {
     Intclass i = new Intclass();
     i.show();
     i.display();
  }
}
interface Int
{
  void show();
  void display();
}
class Intclass implements Int
{
   public void show()
   {
     System.out.println("show method is interface");
   }
   public void display()
   {
     System.out.println("display method is interface"); 
   }
}