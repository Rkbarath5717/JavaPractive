import java.util.*;
public class Swap{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter the first index: ");
        int i=scn.nextInt();
        System.out.print("Enter the second index : ");
        int j=scn.nextInt();

        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = arr[i];

        for(int k=0;k<n;k++){
            System.out.print(arr[k] + " ");
        }
    }
}