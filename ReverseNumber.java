import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int reverse=0;
        while(n != 0){
            int digit = n % 10;
            reverse=reverse*10+digit;
            n = n/10;
        }
        System.out.print("Reverse ="+reverse);
    }
}