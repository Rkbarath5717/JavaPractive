import java.util.*;
public class Majority {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        boolean found = false;
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                
            }
            if(count > n/2){
                System.out.println("Majority = "+ arr[i]);
                found =true;
                break;
            }
        }
    }
}