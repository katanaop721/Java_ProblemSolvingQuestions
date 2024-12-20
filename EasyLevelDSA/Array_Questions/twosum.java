package EasyLevelDSA.Array_Questions;

import java.util.ArrayList;

public class twosum {
    public static void main(String[] args) {
        int[] arr ={2,6,5,8,11};
        int target = 14;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans.add(arr[i]);
                    ans.add(arr[j]);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
