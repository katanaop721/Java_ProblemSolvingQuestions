public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        String str="my name is anku";
        //int ptr=0;
        System.out.print(str.charAt(0));
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                System.out.print(str.charAt(i+1));
            }
        }
    }
}
