package Binary_Search.Strings;

public class FindMaxOccurChar {
    public static void main(String[] args) {
        //How to find the maximum occurring character in a given String?
        String str="abcd";
        int max_count=1;
        char Max_char=str.charAt(0);
        for(int i=0;i<str.length();i++){
            int count=1;
            char currentChar=str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(currentChar==str.charAt(j)){
                    count++;
                }
            }
            if(count>max_count){
                max_count=count;
                Max_char=currentChar;
            }
        }
        System.out.println(Max_char+" "+max_count);
        
    }
}
