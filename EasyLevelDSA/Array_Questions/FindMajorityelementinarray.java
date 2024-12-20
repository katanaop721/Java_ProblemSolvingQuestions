package EasyLevelDSA.Array_Questions;

public class FindMajorityelementinarray {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        int n=arr.length/2;
        
        int count=1;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n){
                ans=arr[i];   
            }

            
        }
        System.out.println(ans);
    }

}
