import java.util.*;
public class Found{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int value =scn.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==value){
                found=true;
            }
        }
          System.out.println();
          
        if(found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}