import java.util.Arrays;
import java.util.Scanner;

public class ProductSmallestPair {
     public static int Calculate(int sum, int arr[], int n){
        if(arr==null)
        return -1;
        if(n<2)
        return -1;
        Arrays.sort(arr);
        int smallest1=arr[0];
        int smallest2=arr[1];

        if ((smallest1+smallest2)<=sum) {
            return smallest1*smallest2;
        }
        else
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt ();
        int sum = sc.nextInt();
        System.out.println(Calculate(sum, arr,n));
        sc.close();
    }
}
