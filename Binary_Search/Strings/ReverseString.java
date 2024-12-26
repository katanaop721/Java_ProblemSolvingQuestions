package Binary_Search.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str="this is an amazing program";
        String[] ans=str.split(" ");
        StringBuilder reverseString=new StringBuilder();
        for(int i=ans.length-1;i>=0;i--){ 
        reverseString.append(ans[i]);
        if(i!=0){
            reverseString.append(" ");
        }
    }
    System.out.println(reverseString);
}
}
