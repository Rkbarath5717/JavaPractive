import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the size of an array = ");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the element of an array = ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print( arr[i] + " ");
        }
    }
}