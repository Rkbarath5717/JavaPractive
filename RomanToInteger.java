import java.util.*;
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String s = scn.nextLine();
        int sum =0;
        int prev=0;

        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            int current = 0;
            if(c=='I') current = 1;
            else if(c=='V') current = 5;
            else if(c=='X') current = 10;
            else if(c=='L') current = 50;
            else if(c=='C') current = 100;
            else if(c=='D') current = 500;
            else if(c=='M') current = 1000;

            if(current < prev){
                sum = sum - current;
            }
            else{
                sum = sum + current;
            }

            prev = current;
        }
        System.out.println("Ineteger value = " + sum);
    }
}