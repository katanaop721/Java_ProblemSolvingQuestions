package Binary_Search.Strings;

public class RemoveRepeatedWords {
    public static void main(String[] args){

        // How to remove repeated words from output in string without using predefined methods.
        String str="raam";
        String ans="";
        boolean insert=false;
        ans=""+str.charAt(0);
        //System.out.print(ans);
        for(int i=1;i<str.length();i++){
            char temp=str.charAt(i);
            insert=false;
            for(int j=0;j<ans.length();j++){
                if(temp==ans.charAt(j)){
                    insert=true;
                    break;
                }
            }
            if(insert==false){
                ans=ans+temp;
            }
        }
        System.out.print(ans);

    }
}
