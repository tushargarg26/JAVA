import java.util.Scanner;

public class ReplaceCharacter {
    public static String ReplaceChar(String str, int n, char ch1, char ch2){
        
        String res="";
        for(int i=0;i<n;i++){
            if(str.charAt(i)==ch1)
            res= res+ch2;
            else if(str.charAt(i)==ch2)
            res= res+ch1;
            else
            res=res+str.charAt(i);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        char ch1= sc.next().charAt(0);
        char ch2= sc.next().charAt(0);
        System.out.println(ReplaceChar(str, str.length(), ch1, ch2));
        sc.close();
    }
}
