package EasyLevelDSA.Array_Questions;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args){
        int arr[]={0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(arr);
        int count=arr[0];
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==count){
                ans++;
                count++;
            }
        }
        System.out.print(ans);
    }
}
