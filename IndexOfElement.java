import java.util.*;
public class IndexOfElement {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println("index ="+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }
}