package EasyLevelDSA.Array_Questions;

public class SecondSmallestSecondLargest {
    public static void main(String[] args) {
        int[] arr={2,4,1,6,8,3,5};
        int largest=0;
        int secondlargest=0;
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];

            }
            else if(arr[i]>secondlargest & arr[i]!=largest){
                secondlargest=arr[i];
            }
            if(smallest>arr[i]){
                secondsmallest=smallest;
                smallest=arr[i];
            }
            else if(secondsmallest>arr[i] & arr[i]!=smallest){
                secondsmallest=arr[i];
            }
        }
        System.out.println(secondlargest);
        System.out.println(secondsmallest);
}
}
