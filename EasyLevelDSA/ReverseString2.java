package EasyLevelDSA;

public class ReverseString2 {
    public static String Reverse(String rev){
        String reverstring="";
            for(int i=rev.length()-1;i>=0;i--){
                reverstring=reverstring+rev.charAt(i);
            }
        
        return reverstring;
    }
    public static void main(String[] args) {
        String str="i like this program very much";
        String[] str1=str.split(" ");
        
        String finalStr="";
        for(int i=0;i<str1.length;i++){ 
        finalStr=finalStr+Reverse(str1[i])+" ";
    }
    System.out.print(finalStr);
    }
    
}
