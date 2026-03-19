import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();
        boolean found =false;
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    System.out.print(arr[i] + "+" +arr[j]+ "=" + target);
                    found = true;
                }
            }
            break;
        }
        System.out.println();
        if(found){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}