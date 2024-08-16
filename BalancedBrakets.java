/* You are given a string representing an expression.
 * You are required to check the expression is balanced, i.e., opening and closing brakets match with each other.
 */

import java.util.*;

public class BalancedBrakets {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String=");
        String str=  sc.nextLine();
        Stack<Character> st = new Stack<>();


    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);

        if(ch == '(' || ch== '{' || ch== '['){
             st.push(ch);
        }else if(ch==')'){
            boolean val =handleClosing(st, '(');
            if(val == false){
                System.out.println(val);
                return;
            }

        }else if(ch =='}'){
           boolean val =handleClosing(st, '(');
            if(val == false){
                System.out.println(val);
                return;
            }

        }else{
           boolean val =handleClosing(st, '(');
            if(val == false){
                System.out.println(val);
                return;
            }
        }
        sc.close();
   } 
   if(st.size()!=0){
                System.out.println("FALSE");
                return;           
   }else{
    System.out.println("TRUE");
   } 

}
public static boolean handleClosing(Stack<Character> st, char corresopench){
    if(st.size()==0){
        return false;
    }else if(st.peek() !=corresopench ){
        return false;
    }else{
        st.pop();
        return true;
    }

}

}

