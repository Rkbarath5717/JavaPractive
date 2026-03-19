import java.util.*;
public class Eqlibrium {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            int left=0;
            int right =0;
            for(int j=0;j<i;j++){
                left+=arr[j];
            }
            for(int j=i+1;j<n;j++){
                right+=arr[j];
            }
            
            if(left == right){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}