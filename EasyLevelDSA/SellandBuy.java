package EasyLevelDSA;

public class SellandBuy {
    public static void main(String[] args) {
        int maxprofit=0;

        int profit=Integer.MIN_VALUE;
        int[] prices={7,1,5,3,6,4};
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                profit=prices[j]-prices[i];
                if(profit>0){
                    maxprofit=Integer.max(maxprofit, profit);

                }    
            }
            }
            System.out.println(maxprofit);
        }
    }

