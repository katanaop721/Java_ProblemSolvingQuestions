

public class SmallestValueInArray {
    public static void main(String[] args){
        int[] arr={4,3,1,57,9,3,1};
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
}
