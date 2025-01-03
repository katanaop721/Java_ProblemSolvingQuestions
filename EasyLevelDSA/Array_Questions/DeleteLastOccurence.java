package EasyLevelDSA.Array_Questions;

public class DeleteLastOccurence {
        public static void main(String[] args) {
            int[] arr={1, 3, 5, 7};
            int element=2;
            int deleteElementIndex=0;

            for(int i=arr.length-1;i>=0;i--){
                if(element==arr[i]){
                    deleteElementIndex=i;
                    break;
                }
            }
            if(deleteElementIndex==0){
                System.out.println("No Element Found");
                return;
            }
            else{
                for(int i=deleteElementIndex;i<arr.length-1;i++){
                    arr[deleteElementIndex]=arr[i+1];
                }
            }
            for(int i=0;i<arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }

        }
}
