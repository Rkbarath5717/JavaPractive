import java.util.*;
public class product {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        int product=1;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            product*=arr[i];
        }
        System.out.println("Total product ="+product);
    }
}