package EasyLevelDSA.Array_Questions;

public class FindElementOnlyonce {
    public static void main(String[] args) {
        int[] arr ={4,1,2,2,1};
        
        // for(int i=0;i<arr.length;i++){
        //     int ans=arr[i];
        //     int count=0;
        //     for(int j=0;j<arr.length;j++){
        //         if(ans==arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         System.out.print(ans);
        //         break;
        //     }
        // }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        System.out.println(ans);
        

    }
}
