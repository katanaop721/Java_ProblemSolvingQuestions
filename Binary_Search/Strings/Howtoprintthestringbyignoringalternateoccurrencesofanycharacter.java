package Binary_Search.Strings;

public class Howtoprintthestringbyignoringalternateoccurrencesofanycharacter {
    
        public static void main(String[] args) {
            String str="aaabbbcc";
            String ans="";
            int firstPTR=0;
            int secondPTR=0;
            for(int i=0;i<str.length();i++){
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(firstPTR)!=str.charAt(secondPTR)){
                        ans=ans+str.charAt(firstPTR);
                        firstPTR=j;
                        secondPTR=j;

                    }
                    else{
                        j++;
                    }
                    //i++;
                }
            }
            System.out.println(ans);
        }
}
