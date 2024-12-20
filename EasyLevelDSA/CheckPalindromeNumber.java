package EasyLevelDSA;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int num=12212;
        int originalnum=num;
        int revnum=0;
        int lastdigit=0;
        while(num!=0){
            lastdigit=num%10;
           
            revnum=(revnum*10)+lastdigit;
            num=num/10;
        }
        System.out.println(revnum);
        if(originalnum == revnum){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
    }
}
