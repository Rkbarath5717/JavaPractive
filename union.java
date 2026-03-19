import java.util.*;
public class union {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter 1st array =");
        int n1=scn.nextInt();
        int arr1[] = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }

        System.out.println("Enter 2nd array =");
        int n2=scn.nextInt();
        int arr2[] = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }

        for(int i=0;i<n1;i++){
            System.out.println(arr1[i] + " ");
        }
        for(int i=0;i<n2;i++){
            boolean found =false;
            for(int j=0;j<n1;j++){
                if(arr2[i] == arr1[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
            System.out.print(arr2[i] + " ");
           }
        }

    }
}