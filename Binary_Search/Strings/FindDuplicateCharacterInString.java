package Binary_Search.Strings;

public class FindDuplicateCharacterInString {
    public static void main(String[] args) {
        String str="apple";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){   
                    System.out.println("Duplicate Character : "+str.charAt(j));
                    break;
                }

            }
        }
    }
}
