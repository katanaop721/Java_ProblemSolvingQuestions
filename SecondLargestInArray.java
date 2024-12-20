

public class SecondLargestInArray {
    public static void main(String[] args) {
     int[] arr={4,1,7,5,2,9,8};
    //first approach
    // Arrays.sort(arr);
    // System.out.print(arr[arr.length-2]);
        int largest=0;
        int secondlargest=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
            
        }
        System.out.print(secondlargest);     
    }
}
