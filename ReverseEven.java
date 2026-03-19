import java.util.*;
public class ReverseEven {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int left =0;
        int right =n-1;
        while (left < right){
            if(arr[left] %2 !=0){
                left++;
            }
            else if(arr[right] %2 !=0){
                right--;
            }
            else{
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}