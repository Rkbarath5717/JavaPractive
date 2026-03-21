import java.util.*;
public class PrimarySecondaryDiognol {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
          System.out.println("Primary Diogonal = ");
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("Seconday Diogonal = ");
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j == n-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}