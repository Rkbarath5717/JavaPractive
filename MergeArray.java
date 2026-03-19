import java.util.*;
public class MergeArray{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int arr1[]=new int [n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }

        int n3=scn.nextInt();
        int arr3[]=new int[n3];
        for(int i=0;i<n3;i++){
            arr3[i]=scn.nextInt();
        }

        int merge[]=new int [n1+n2+n3];

        for(int i=0;i<n1;i++){
            merge[i]=arr1[i];
        }

        for(int i=0;i<n2;i++){
            merge[n1 + i] = arr2[i];
        }
           for(int i=0;i<n3;i++){
            merge[n1 + n2 + i ] = arr3[i];
        }
        
        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i] + " ");
        }
    }
}