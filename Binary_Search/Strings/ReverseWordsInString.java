package Binary_Search.Strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str="the sky is blue";
        String[] temp=str.split(" ");
        for(int i=temp.length-1;i>=0;i--){
                System.out.print(temp[i]+" ");
        }

    }
}
