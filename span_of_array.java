// Span- Difference between Largest and Smallest elemnet of the array

import java.util.Scanner;
public class span_of_array {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter size of the array-");
        int n= sc.nextInt();
        int[] arr=new int[n];
    
        // intiliazing the array
        System.out.println("Enter Elements in the array-");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        //printing the array
           System.out.println("Elements in the array are-");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"     ");
        }
        //finding max and min element of the array
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];

            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println();
        int span= max-min;
         System.out.println("Span of Array= "+span);
         sc.close();
    }
}
