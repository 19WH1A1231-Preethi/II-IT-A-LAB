//Parameterised constructor(inheritance)
class Base
{
  Base(int x)
  {
     int a = x;
     System.out.println("Value of a is:"+a);
  }
  Base()
  {
     System.out.println("Base class constructor");
  }
    
}
class Child extends Base
{
  Child()
  {
     super(100);
     System.out.println("Parent class constructor");
  }
}
class Parameterised_Constructor
{
   public static void main(String args[])
   {
      Child obj = new Child();
   }
}