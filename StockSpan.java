/* Given an array of n size. find the span(or gap of NEXT GREATER ELEMENT TO THE LEFT) for each element */
import java.util.*;
public class StockSpan {
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
        int[] span=new int[arr.length];

        st.push(0);
        span[0]=1;
        for(int i=1;i<arr.length;i++){

                while(st.size()>0 && arr[i]>arr[st.peek()]){
                    st.pop();
                }
                if(st.size()==0){
                    span[i]=i+1;
               }else{
                span[i]=i-st.peek();     
            }
            st.push(i);
                
        }
            System.out.println("Span for each element-");

            for(int i=0; i<arr.length;i++){
            System.out.println(span[i]);
            }
            sc.close();          
}
}