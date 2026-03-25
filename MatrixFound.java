import java.util.*;
public class MatrixFound {
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
        int key=scn.nextInt();
        boolean found = false;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==key){
                    found=true;
                    break;
                }
            }
        }
        System.out.println("found");
    }
}