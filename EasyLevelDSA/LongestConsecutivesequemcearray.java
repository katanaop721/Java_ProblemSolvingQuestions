package EasyLevelDSA;

public class LongestConsecutivesequemcearray {
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 4};
        int maxCount=0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]+1){
                    count++;
                }
            }
            maxCount=Integer.max(maxCount, count);
        }
        System.out.println(maxCount);
    }
}
