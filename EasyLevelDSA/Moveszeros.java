package EasyLevelDSA;

public class Moveszeros {
    public static void main(String[] args){
        int[] arr={1,0,2,3,0,4,0,1};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]>=1){
                left++;
            }
            else if(arr[right]==0){
                right--;
            }
            else{ 
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
