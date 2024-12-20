package EasyLevelDSA;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=12111;
        int originaln=n;
        int lastdigit=0;
        int ans=0;
        while(n!=0){
            lastdigit=n%10;
            lastdigit=lastdigit*lastdigit*lastdigit;
            ans=ans+lastdigit;
            n=n/10;
        }
        if(originaln==ans){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
