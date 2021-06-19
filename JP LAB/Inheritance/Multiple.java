interface Printable
{
   int a = 5;
}
interface Showable
{
   int b = 10;
}
class Child implements Printable,Showable
{
     public void mul()
{
   int c = 50;
   System.out.println("Multiplication:"+(a*b*c));
}
}
class Multiple
{
    public static void main(String args[])
{
   Child obj = new Child();
   obj.mul();
}
}