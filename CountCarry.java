import java.util.ArrayList;
import java.util.Scanner;

public class CountCarry {
    public static String Calculate(int num, int n){
        String str="";
        ArrayList<Integer> rem = new ArrayList<>();
        rem.add(num%n);
        
        int quotient=num/n;

        while(quotient!=0){
           rem.add(quotient%n);
           quotient=quotient/n;
        }
        for(int i=0; i<rem.size();i++){
            if(rem.get(i)>9)
            str= (char) (rem.get(i) -9+64)+str;
            else
            str= rem.get(i)+str;
        }
        return str;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num = sc.nextInt();
        System.out.println(Calculate(num, n));
        sc.close();
    }   
}
