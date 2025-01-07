//number is palindrome or not ex:121 is palindrome
public class problem4 {
    public static void isPalindrome(int n){
        int palindrome=n;

        int reverse=0;
        while(palindrome!=0){
            int lastDigit=palindrome%10;
            reverse=reverse*10+lastDigit;
            palindrome=palindrome/10;


        }
        if(n==reverse){
            System.out.println("it is palindorme");
        }else{
            System.out.println("it is not palindorme");
        }
        
        

    }
    public static void main(String[] args) {
       isPalindrome(1251);

        
    }
    
}
