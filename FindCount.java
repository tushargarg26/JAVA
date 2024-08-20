import java.util.Scanner;

public class FindCount {
    public static int Calculate(int arr[], int n, int num, int diff){
        if(arr==null)
        return -1;
        int count=0;
        for(int i=0; i<n;i++){
            if(Math.abs(num-arr[i])<=diff)
            count++;
        }
        return count>0?count:-1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt ();
        int num = sc.nextInt();
        int diff = sc.nextInt();
        System.out.println(Calculate(arr,n, num, diff));
        sc.close();
    }
}
