public class PalinDromeString {
    public static void main(String[] args) {
        String str="babab";
        int ptr1=0;
        int ptr2=str.length()-1;
        boolean palindrome=true;
        while(ptr1<ptr2){
            if(str.charAt(ptr1)!=str.charAt(ptr2)){
                palindrome=false;
                break;
            }
            ptr1++;
            ptr2--;
        }
if(palindrome){
    System.out.print("Palindrome");  
}else{System.out.print("Not a palindrome");}
    }
}
