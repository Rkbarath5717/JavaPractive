import java.util.*;
public class SpiralMatrix{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int arr[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int left=0,right=c-1;
        int top=0;int bottom=r-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;

            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                System.out.print(arr[bottom][i]+ " ");
            }
            bottom--;

            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
}