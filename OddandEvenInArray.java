public class OddandEvenInArray {
    public static void main(String[] args) {
        int[] arr={2,5,1,1,7,5,2};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("even :"+arr[i]);
            }
            else{
                System.out.println("odd :"+arr[i]);
            }
        }
    }
}
