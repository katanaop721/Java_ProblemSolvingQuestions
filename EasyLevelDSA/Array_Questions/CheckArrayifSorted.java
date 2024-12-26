package Array.Array_Questions;

public class CheckArrayifSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int count=arr[0];
        Boolean ans=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=count){
                ans=false;
                break;
            }
            count++;
        }
        System.out.println(ans);
    }
}
