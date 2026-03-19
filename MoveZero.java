import java.util.*;
public class MoveZero {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
             while(count < n){
                arr[count] = 0;
                count++;
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
    }
}