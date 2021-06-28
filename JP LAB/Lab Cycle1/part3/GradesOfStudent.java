import java.util.Scanner;
public class GradesOfStudent
{
   public static void main(String[] args)
   {
      float sum=0,avg;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of Subjects: ");
      int n = sc.nextInt();
      int mark[] = new int[n];
      System.out.println("Enter marks of Subjects: ");
      for(int i=0;i<n;i++){
           mark[i] = sc.nextInt();
           sum = sum + mark[i];
       }
       avg = sum/n;
       System.out.println("Average is: "+avg);
       System.out.println("Grade of a Student is: ");
       if(avg > 90){
            System.out.print("A");
        }
        else if(avg > 80 && avg < 90){
             System.out.print("B");  
        }
        else if(avg > 60 && avg < 80){
             System.out.print("C");  
        }
         else if(avg > 40 && avg < 60){
             System.out.print("D");  
        }
        else if(avg < 40){
             System.out.print("Fail");  
        }
    }
}