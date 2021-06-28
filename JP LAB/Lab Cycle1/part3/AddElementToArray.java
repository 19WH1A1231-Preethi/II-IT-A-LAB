import java.util.Arrays;  
public class AddElementToArray 
{  
     public static void main(String[] args)
     {  
         int arr[] = {10,25,31,43,56,62};  
         int n = arr.length;  
         int newArr[] = new int[n+1];  
         int value = 29;  
         System.out.println(Arrays.toString(arr));  
         for(int i = 0; i<n; i++) {  
                  newArr[i] = arr[i];  
         }  
         newArr[n] = value;  
        System.out.println(Arrays.toString(newArr));  
    }  
}  