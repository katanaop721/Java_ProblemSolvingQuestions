package Binary_Search.Strings;

public class Reversestringwithoutusingtemp {
    public static void main(String[] args){
        String str="abcde";
        char temp;
        int start=0;
        int end=str.length()-1;
        while(start<end){
            temp=str.charAt(start);
            str.charAt(start)=temp;
        }


    }
}
