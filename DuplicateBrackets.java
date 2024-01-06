/* You are given a string representing an expression.
 * assume that the expression is balanced, i.e., opening and closing brakets match with each other.
 * but some pair of brakets may be extra or needless.
 * You are required to print true is extra brakets exists otherwise false.
 */

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String=");
        String str= sc.nextLine();
        Stack<Character> st = new Stack<>();


    for(int i=0;i<str.length();i++){
        char ch= str.charAt(i);
        if(ch==')'){
            if(st.peek()=='('){
                System.out.println("TRUE: Duplicate brakets EXISTS.");
                return;
            }
            else{
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();

            }

        }
        else{
            st.push(ch);
        }
       
    }   
     System.out.println("FLASE: Duplicate Brakets dosen't Exists.");

    }
}