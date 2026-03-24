import java.util.*;
public class ArrayProduct {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int product=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                product*=arr[i][j];
            }
        }
        System.out.println(product);
    }
}