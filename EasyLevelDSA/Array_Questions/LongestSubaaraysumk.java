package EasyLevelDSA.Array_Questions;

public class LongestSubaaraysumk {
    public static void main(String[] args) {
         int[] array={2,3,5,1,9};
         int len=0;
         int target=10;
            for(int i=0;i<array.length;i++){
                for(int j=i;j<array.length;j++){
                    int sum=0;
                    for(int k=i;k<=j;k++){
                        sum+=array[k];
                    }
                    if(sum==target){
                        len=Integer.max(len,j-i+1);
                    }
                }
            }
            System.out.println(len);
    }
}
