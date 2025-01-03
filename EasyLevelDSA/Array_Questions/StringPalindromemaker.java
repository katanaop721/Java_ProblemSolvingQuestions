package EasyLevelDSA.Array_Questions;

public class StringPalindromemaker {
    public static void main(String[] args) {
        String str="aab";
        boolean stringStatus=true;
        if(str.length()==2){
            System.out.print("1");
            return;
        }
        if(str.length()==0 || str.length()==1){
            System.out.println("0");
            return;
        }
        //checking if string is palindrome
        if(stringStatus==true){
            int start=0;
            int end=str.length()-1;
            while(start<end){
                if(str.charAt(start)!=str.charAt(end)){
                    stringStatus=false;
                    break;
                }
                start++;
                end--;
            }
        }

        if(stringStatus==false){
            System.out.println(str.length()-1);
        }
        else{
            System.out.println("String is already palindrome");
        }
    }
}
