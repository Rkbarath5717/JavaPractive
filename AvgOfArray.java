import java.util.*;
public class AvgOfArray{
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.print("Enter the size of an Aray = ");
      int n=scn.nextInt();
      int arr[]=new int[n];
      int sum=0;
      System.out.print("Enter the elements = ");
      for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
        sum+=arr[i];
      }
      int avg=sum/n;
      System.out.print(avg);
    }
}