public class SecondLargestNumber2 {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 4, 45, 99};
        int largest=0;
        int secondlargest=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                secondlargest=largest;
                largest=numbers[i];
            }
            else if(numbers[i]>secondlargest && numbers[i]!=largest){
                secondlargest=numbers[i];
            }
        }
        System.out.print(secondlargest);
        
    }
}
