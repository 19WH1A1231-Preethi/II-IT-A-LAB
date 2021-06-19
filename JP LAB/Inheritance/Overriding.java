class Base
{
void show(){
  System.out.println("Child class method");
}
}
class Child extends Base
{
 void show()
   {
   System.out.println("Child class method");
   }
 void Display()
   {
   show();
   super.show();
   }
}
class Overriding
{
  public static void main(String args[])
  {
    Child c = new Child();
    c.Display();
  }
}
  