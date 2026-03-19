import java.util.*;
public class DeleteElementWithoutShift {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int key=scn.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                arr[i]=arr[n-1];
                n--;
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
     
    }
}