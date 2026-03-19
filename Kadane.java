import java.util.*;
public class Kadane {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int current = arr[0];
        int max = arr[0];

        for(int i=1;i<n;i++){
            current=Math.max(arr[i],current+arr[i]);
            max=Math.max(max,current);
        }
        System.out.println(max);
    }
}