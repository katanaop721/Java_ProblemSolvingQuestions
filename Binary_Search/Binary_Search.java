package Binary_Search;

public class Binary_Search {
    public static void main(String[] args) {
        
    
    int[] arr={1,2,3,4,5,6,7};
    int target=3;
    int start=0;
    int end=arr.length-1;
    
    while(start<=end){
        int mid=start + (end - start) / 2;
        if(target==arr[mid]){
            System.out.print(mid);
            return;
        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }

    }
    System.out.println("Target not found.");
}
}
