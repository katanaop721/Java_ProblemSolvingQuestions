package EasyLevelDSA.Array_Questions;

public class RotateElementbyK {
    public static void main(String[] args){
            int[] arr={1,2,3,4,5,6};
            int k=3;
            int[] temp=new int[k];
            for(int i=0;i<k;i++){
                temp[i]=arr[i];
            }
            for(int i=k;i<arr.length;i++){
                arr[i-k]=arr[i];
               
            }
            for(int i = 0; i < k; i++) {
                arr[arr.length - k + i] = temp[i];
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }

    }
}
