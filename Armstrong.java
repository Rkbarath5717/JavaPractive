import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scn.nextInt();
        int original = num;
        int sum=0;
        while(num > 0){
            int digit = num % 10;
            sum +=(digit*digit*digit);
            num/=10;
        }
        System.out.println();
        if(sum == original){
            System.out.print("it is a Armstrong ");
        }
        else{
            System.out.print("it is not Armstrong");
        }
    }
}