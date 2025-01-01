package Binary_Search.Strings;

import java.util.Arrays;

public class StringAngram {
    public static void main(String[] args) {
        String s1 = "geeks";  
        String s2 = "eekgs";
        if(s1.length()!=s2.length()){
            System.out.println("String is not angram");
            return;
        }
        char[] s1array=s1.toCharArray();
        char[] s2array=s2.toCharArray();
        Arrays.sort(s1array);
        Arrays.sort(s2array);
        boolean ans=true;
        for(int i=0;i<s1array.length;i++){
            if(s1array[i]!=s2array[i]){
                ans=false;
                break;
            }
        }
        if(ans){
            System.out.println("String is angram");
        }
        else{
            System.out.println("String is not angram");
        }
    }
}
