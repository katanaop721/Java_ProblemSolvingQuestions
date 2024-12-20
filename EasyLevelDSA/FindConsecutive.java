package EasyLevelDSA;

public class FindConsecutive {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1} ;
        int maxcount=1;
        int count=1;
        int ptr=0;
        for(int i=0;i<arr.length-1;i++){
             
            if(arr[ptr]==arr[i+1]){
                count++;
                ptr++;
            }else{
                maxcount=Integer.max(maxcount,count);
                count=1;
                ptr++;
            }
            maxcount=Integer.max(maxcount,count);

        }
        System.out.println(maxcount);
    }
}
