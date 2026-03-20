import java.util.*;
public class DeleteShifting{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int key=scn.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("No element");
        }
        else{
            for(int i=index;i<n-1;i++){
            arr[i]=arr[i+1];
            }
            n--;
            }
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(arr));
        }
    }
}