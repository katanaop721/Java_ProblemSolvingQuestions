package EasyLevelDSA;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={4,3,1,6,4,1,5,7,12};
        int largest=0;
        int secondL=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondL=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondL && arr[i]!=largest){
                secondL=arr[i];
            }
        }
        System.out.print(secondL);
    }
}
