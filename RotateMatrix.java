import java.util.*;
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int k=scn.nextInt();
        k=k%4;
        for(int s=0;s<k;s++){
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }

            for(int i=0;i<n;i++){
                int start=0;
                int end=n-1;
                while(start<end){
                    int temp=arr[i][start];
                    arr[i][start]=arr[i][end];
                    arr[i][end]=temp;
                    start++;
                    end--;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}