public class ReverseString {
    public static void main(String[] args) {
         String str="anku";
         String newstr="";
         for(int i=str.length()-1;i>=0;i--){
            newstr=newstr + str.charAt(i);
         }
         System.out.print(newstr);
    }
}
 