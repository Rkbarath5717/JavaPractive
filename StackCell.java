import java.util.*;
public class StackCell {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int price[] = new int [n];
        for(int i=0;i<n;i++){
            price[i]=scn.nextInt();
        }
        int min = price[0];
        int profit =0;
        for(int i=0;i<n;i++){
            if(price[i]<min){
                min=price[i];
            }
            else{
                int Current=price[i] - min;
                if(Current > profit){
                    profit = Current;
                }
            }
        }
        System.out.println(profit);
    }
}