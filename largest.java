public class largest {
    public static void main(String[] args) {
        int arr[]={10,20,40,5,2};
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]> largest ){
                largest =arr[i];
            }
        }
        System.out.print(largest);
    }
}