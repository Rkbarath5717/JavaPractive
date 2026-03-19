import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean visited = false;

            for(int k=0;k<i;k++){
                if(arr[i] == arr[k]){
                    visited = true;
                    break;
                }
            }
            if(visited){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
            }
            System.out.println(arr[i]+ " -> " +count);
        }
    }
}