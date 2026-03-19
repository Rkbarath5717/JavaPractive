import java.util.*;
public class CommonInArray{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }
        boolean common = false;

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    common=true;
                    break;
                }
            }
        }
         if(common){
            System.out.println("yes");
         }
        else{
            System.out.println("no");
        }
    }
}