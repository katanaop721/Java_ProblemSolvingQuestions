package Binary_Search.Strings;

public class FindRepeatedChar {
    //Write a program to find repeated characters from String and they will provide you one string
    public static void main(String[] args) {
        String str="ankua";
        for(int i=0;i<str.length();i++){
                char currentChar=str.charAt(i);
                for(int j=1;j<str.length();j++){
                    if(currentChar==str.charAt(j)){
                        System.out.print("Repeated character  "+currentChar);
                        return;
                    }
                }
                System.out.print("No character is repeating");
        }

    }


}
