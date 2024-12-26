package Array.Array_Questions;

public class CountSubarraysumEqualsK {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int target=3;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=0;
                for(int k=i;k<=j;k++){
                    temp+=arr[k];
                }
                if(temp==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
