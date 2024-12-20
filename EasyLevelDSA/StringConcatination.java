package EasyLevelDSA;

public class StringConcatination {
    public static void main(String[] args) {
        //Input: aaabbbacfwww
        //Output: a3b3acfw3
        String str="aaabbbacfwww";
        String ans="";
        int count=1;
        int ptr1=0;
        while(ptr1<str.length()-1){
            if(str.charAt(ptr1)==str.charAt(ptr1+1)){
                count++;
                
            }
            else{
                ans+=str.charAt(ptr1);
                if(count>1){
                    ans+=count;
                }
                count=1;
            }
            ptr1++;
            
        }
        ans += str.charAt(ptr1);
        if (count > 1) {
            ans += count;
        }
        System.out.println(ans);

    }
    
}
