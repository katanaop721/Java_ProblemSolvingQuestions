package Binary_Search.Strings;

public class LargestOddNumberinString {
    public static void main(String[] args) {
        String str="35427";
        int temp=0;
        int ans=0;
        for(int i=0;i<str.length();i++){
            temp=Character.getNumericValue(str.charAt(i));
            if(temp%2!=0){
                if(temp>ans){ 
                ans=temp;
            }
        }
        }
        System.out.println(ans);
    }
}
