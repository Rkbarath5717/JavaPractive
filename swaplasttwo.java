import java.util.*;
public class swaplasttwo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the element of an array: ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;

        System.out.print("Final array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}