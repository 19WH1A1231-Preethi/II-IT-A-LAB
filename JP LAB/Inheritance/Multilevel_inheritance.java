class Base
{
   int a = 10;
}
class Child extends Base
{
   int b;
   void sum()
   {
      b = 20;
      System.out.println("Sum of a and b is:"+(a + b));
   }
}
class childchild extends Child
{
   int c = 5;
   void mul()
   {
       System.out.println("Multiplication of a and b is:"+(a*b*c));
   }
}
class Multilevel_inheritance
{
   public static void main(String[] args)
   {
      childchild obj = new childchild();
      obj.sum();
      obj.mul();
   }
}
