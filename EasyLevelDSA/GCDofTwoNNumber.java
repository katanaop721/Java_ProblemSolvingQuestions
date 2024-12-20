package EasyLevelDSA;

public class GCDofTwoNNumber {
    public static void main(String[] args) {
        int n1=20;
        int n2=15;
        int itr=Integer.max(n1, n2);
        int ans=0;
        for(int i=1;i<=itr;i++){
            if(n1%i==0 && n2%i==0){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
