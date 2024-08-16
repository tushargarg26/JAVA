/* Given an array of n size. find the span(or gap of NEXT GREATER ELEMENT TO THE LEFT) for each element */
import java.util.*;
import java.io.*;
public class AreaOfHistogram {
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
        //right boundary
        st.push(arr.length-1);
        int[] rb= new int[arr.length];          //next smaller index on the right
        rb[arr.length-1]=arr.length;
       for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if (st.size()==0) {
                rb[i]=arr.length;
                
            } else {
                rb[i]=st.peek();
            }
            st.push(i);
        }
        //left boundary
        st=new Stack<>();
        st.push(0);
        int[] lb= new int[arr.length];         //next smaller index on the left
        lb[0]=-1;
         for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if (st.size()==0) {
                lb[i]=-1;
                
            } else {
                lb[i]=st.peek();
            }
            st.push(i);
        }
        int maxArea=0;
    //area    
        for(int i=0;i<arr.length;i++){
           
           int width=rb[i]-lb[i]-1;
           int area= arr[i]*width;
           if(area>maxArea){
            maxArea=area;
           }
                
        }
            System.out.print("Max Area in the Histogram is-" + maxArea);

    }
}
