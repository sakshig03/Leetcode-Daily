//binary to decimal
import java.util.*;
public class problem2 {
    public static int binaryToDecaimal(int n){
        
        int pow=0;
        int dec=0;
        while(n>0){
            int lastDigit=n%10;
            dec=dec+lastDigit*(int)Math.pow(2, pow);
            n=n/10;
            pow++;
        }
        return dec;

    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any decimal number: ");
        int n=sc.nextInt();
        System.out.println(binaryToDecaimal(n));
        

        
    }
    
}
