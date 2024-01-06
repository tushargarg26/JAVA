/* You are given a string representing an expression.
 * You are required to check the expression is balanced, i.e., opening and closing brakets match with each other.
 */

import java.util.*;
import java.io.*;

public class BalancedBrakets {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String=");
        String str=  sc.nextLine();
        Stack<Character> st = new Stack<>();


    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch == '(' || '{' || '['){
           
            st.push(ch);

        }
   }   

}

}

