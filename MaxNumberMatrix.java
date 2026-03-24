import java.util.*;
public class MaxNumberMatrix {
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
        int max=arr[0][0];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(arr[i][j]>max){
                        max=arr[i][j];
                    }
                }
            }
            System.out.println(max);
        }
        
    }
