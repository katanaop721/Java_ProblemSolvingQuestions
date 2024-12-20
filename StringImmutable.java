public class StringImmutable {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder();
        str.append("new string");
        str.append("hhf  ahhd  wke");
        for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    str.deleteCharAt(i);
                    i--;
                }
        }
        System.out.print(str);

            //stringbuilder is mutable means we can change the index of value but String is immutable we cannot change the index of value 
    }
}
