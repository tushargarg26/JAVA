/* Given an array of n size. find NEXT GREATER ELEMENT TO THE RIGHT for each element */
import java.util.*;
import java.io.*;
public class NGE {
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
        Stack<Integer> st= new Stack<>();
        int[] nge=new int[arr.length];
        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
                while(st.size()>0 && arr[i]>st.peek()){
                    st.pop();
                }
                if(st.size()==0){
                    nge[i]=-1;
                }else{
                    nge[i]=st.peek();
                }
                st.push(arr[i]);
            }
            System.out.println("Next Greater Element to the right for each element-");
            for(int i=0; i<arr.length;i++){
            System.out.println(nge[i]);
        }
        }
  }
