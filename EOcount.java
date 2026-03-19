import java.util.*;
public class EOcount{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.print(odd);

    }
}