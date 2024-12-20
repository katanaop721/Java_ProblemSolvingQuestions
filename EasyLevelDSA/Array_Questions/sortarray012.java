package EasyLevelDSA.Array_Questions;

public class sortarray012 {
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
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
