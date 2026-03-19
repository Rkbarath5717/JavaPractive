import java.util.*;
public class ZeroCount{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int count =0;
        for(int j=0;j<n;j++){
            if(arr[j] == 0){
                count =count +1;
            }
        }
        System.out.println("Number of zeros = " + count);
    }
}