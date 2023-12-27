import java.util.Scanner;

public class BarChart {
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
        System.out.println();
        //printing the Bar Chart
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        } 
        for(int floor=max; floor>=1;floor--){
            for(int i =0; i<arr.length; i++){
                if(arr[i]>=floor)
                System.out.print("*\t");
                else
                System.out.print("\t");
                
            }
        System.out.println();
    }
  }
}
