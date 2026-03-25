import java.util.*;
public class RowMax {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int r,c;
        r=scn.nextInt();
        c=scn.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            int max=arr[i][0];
            for(int j=0;j<c;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println(i+" "+max);
        }
    }
}