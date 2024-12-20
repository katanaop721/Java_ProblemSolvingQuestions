public class CountNumberOfWords {
    public static void main(String[] args) {
        String str="Hello my name is anku";
        int wordcount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
                    wordcount++;
            }
        }
        System.out.print(wordcount);
    }
}
