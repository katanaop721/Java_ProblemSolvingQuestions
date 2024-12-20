package EasyLevelDSA;

public class ReverseInteger {
        public static void main(String[] args) {
            int n=12345;
            int lastdigit=0;
            int revNum=0;
            while(n!=0){
            lastdigit=n%10;
            n=n/10;
            revNum=(revNum*10)+lastdigit;
            }
            System.out.println(revNum);
        }   
}
