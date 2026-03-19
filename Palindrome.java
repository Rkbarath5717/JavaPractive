import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        boolean palindrome =true;
        for(int i=0;i<n/2;i++){
            if(arr[i] != arr[n-i-1]){
                palindrome = false;
                break;
            }
        }
        System.out.println();
        if(palindrome){
            System.out.println("yes");
        }
        else{
            System.out.println("Not");
        }
    }
}