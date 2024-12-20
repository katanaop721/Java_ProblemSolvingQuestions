package EasyLevelDSA;

public class Sortarray012 {
    public static void main(String[] args) {
         int[] arr={0,1,2,2,1,0};
        //Approach one
        //  for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){ 
        //         int temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //     }
        // }
        //  }

        //approach 2
        //store the count of 0,1,2 and then using the count insert the value
        int count_0=0;
        int count_1=0;
        int count_2=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
            count_0++;
           }
           else if(arr[i]==1){
            count_1++;
           }
           else{
            count_2++;
           }
         }
         for(int i=0;i<arr.length;i++){
          if(count_0>0){
            arr[i]=0;
            count_0--;
          }
          else if(count_1>0){
            arr[i]=1;
            count_1--;
          }
          else if(count_2>0){
            arr[i]=2;
            count_2--;
          }
         }

         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
         }
    }
}
