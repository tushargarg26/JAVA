import java.util.*;
// ques-1,
//link-  https://prepinsta.com/accenture/coding/
class RatRace{
    static int sol(int r, int unit, int arr[], int n){
        if(arr==null)
        return -1;
        int sum=0;
        int count=0;
        //total food required
        int req=r*unit;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            count++;
            if(sum>=req)
            break;
        }
        if (req>sum) {
            return 0;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rats");
        int r= sc.nextInt();
        System.out.println("Enter food consumed by a rat in the area");
        int unit= sc.nextInt();
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(sol(r,unit,arr,n));
    }
}