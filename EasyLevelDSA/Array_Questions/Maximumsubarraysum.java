package EasyLevelDSA.Array_Questions;

public class Maximumsubarraysum {
    public static void main(String[] args) {
        int[] arr={1};
        int maxsum=0;
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        else{ 
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                maxsum=Integer.max(maxsum, sum);
            }

        }
        System.out.println(maxsum);
    }
}
}
