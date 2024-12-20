public class RemoveWhiteSpaceString {
    public static void main(String[] args) {
        String str="my name is anku";
        String newstr="";
        
        for(int i=0;i<str.length();i++){
            //System.out.print(str.charAt(i));
            if(str.charAt(i) != ' '){
                newstr=newstr+str.charAt(i);
            }
        }
        System.out.print(newstr);

        //Approach 2
        // StringBuilder str= new StringBuilder();
        // str.append("new string");
        // str.append("hhf  ahhd  wke");
        // for(int i=0;i<str.length();i++){
        //         if(str.charAt(i)==' '){
        //             str.deleteCharAt(i);
        //             i--;
        //         }
        // }
        // System.out.print(str);

    }
}
