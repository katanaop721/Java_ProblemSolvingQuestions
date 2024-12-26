package Array.Array_Questions;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,7,3};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max);
    }
}
