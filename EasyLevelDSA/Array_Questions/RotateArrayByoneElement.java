package EasyLevelDSA.Array_Questions;

public class RotateArrayByoneElement {
        public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            //2,3,4,5,1
            int firstElement=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=firstElement;

            for(int i=0;i<arr.length;i++){  
                System.out.print(arr[i]);
            }
        }
}
