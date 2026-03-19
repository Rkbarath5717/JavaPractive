import java.util.*;
public class SortedArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        boolean sort=true;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                sort=false;
                break;
            }
        }
        if(sort){
            System.out.println("sorted array");
        }
        else{
            System.out.println("Not sorted");
        }

    }
}