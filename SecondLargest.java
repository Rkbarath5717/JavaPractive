import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int largest=arr[0];
        int second=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
        }
        System.out.print("second largest of an array = " + second);
    }
}