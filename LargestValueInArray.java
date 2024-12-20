public class LargestValueInArray {
    public static void main(String[] args) {
        int[] arr={4,3,1,6,8,5,1,5};
        int largest=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
