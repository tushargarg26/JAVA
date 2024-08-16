//Array2-Array1
import java.util.Scanner;

public class DiffOfArrays {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter size of the array1-");
        int n1= sc.nextInt();
        int[] a1=new int[n1];
    
        System.out.println("Enter Elements in the array1-");
        for(int i=0; i<a1.length;i++){
            a1[i]= sc.nextInt();
            sc.close();
        }

        
        System.out.println("Enter size of the array2-");
        int n2= sc.nextInt();
        int[] a2=new int[n2];

        System.out.println("Enter Elements in the array2-");
        for(int i=0; i<a2.length;i++){
            a2[i]= sc.nextInt();
        }
        int[] diff= new int[n1>n2?n1:n2];
        int c=0;
        int i=a1.length-1;
        int j=a2.length-1;
        int k=diff.length-1;

        while(k>=0){
            int d=0;
            int a1v=i>=0?a1[i]:0;
            if(a2[j]+c>=a1v){
                d=a2[j]+c-a1v;
                c=0;
            }
             else{
                d=a2[j]+c+10-a1v;
                c=-1;
            }
            
            diff[k]=d;

            i--;
            j--;
            k--;
        }
        int idx=0;
        for(idx=0;idx<diff.length;idx++){
            if(diff[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }
        System.out.println("Difference of the Arrays is-");
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
        sc.close();
    }
}
