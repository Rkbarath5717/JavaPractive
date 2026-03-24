import java.util.*;
public class MatrixProduct2{
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int r1,c1,r2,c2;
        r1=scn.nextInt();
        c1=scn.nextInt();
        r2=scn.nextInt();
        c2=scn.nextInt();


        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];


        if(r1 != c2){
            System.out.println("not possible");
            return;
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=scn.nextInt();
            }
        }
          for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                c[i][j]=0;
                for(int k=0;k<c1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}