import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int current=0;
        int max=0;

        for(int i=0;i<n;i++){
            current+=arr[i];

        if(current > max){
            max = current;
        }
        if(current < 0){
            current =0;
        }

        }
        System.out.println(max);
  
    }
}