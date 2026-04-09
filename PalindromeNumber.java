import java.util.*;
public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int original=n;
        int reverse=0;
        while(n != 0){
            int digit = n %10;
            reverse = reverse *10 + digit;
            n = n / 10;
        }
        if(original == reverse){
            System.out.print("It is a palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
}