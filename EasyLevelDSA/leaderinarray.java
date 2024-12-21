package EasyLevelDSA;

public class leaderinarray {
    public static void main(String[] args) {
        int[] arr={4, 7, 1, 0};
        
        for(int i=0;i<arr.length;i++){
            boolean greater=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    greater=false;
                    break;
                }
            }
            if(greater){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
