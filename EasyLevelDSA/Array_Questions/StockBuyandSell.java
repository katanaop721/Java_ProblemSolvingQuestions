package EasyLevelDSA.Array_Questions;

public class StockBuyandSell {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int profit=0;
        int maxprofit=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                profit=arr[j]-arr[i];
                maxprofit=Integer.max(maxprofit, profit);
            }
            maxprofit=Integer.max(maxprofit, profit);
        }


    System.out.println(maxprofit);

        
    }
}
