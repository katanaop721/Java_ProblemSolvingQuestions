package EasyLevelDSA.Array_Questions;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        int ans=-1;
        int target=5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans=i;
                break;
            }
        }
        System.out.print(ans);
    }
}
