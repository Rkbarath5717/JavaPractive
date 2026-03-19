import java.util.*;
public class Missing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int xo1=0;
        int xo2=0;
        for(int i=0;i<n;i++){
            xo1=xo1 ^ arr[i];
        }
        for(int i=1;i<=n+1;i++){
            xo2=xo2 ^ i;
        }

        int missing = xo1 ^ xo2 ;

        System.out.println(missing + " " +"is missing in your order");
    }
}