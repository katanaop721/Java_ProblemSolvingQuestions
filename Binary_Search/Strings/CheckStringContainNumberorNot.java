package Binary_Search.Strings;

public class CheckStringContainNumberorNot {

    public static void main(String[] args) {
        String str="4631a32";
        boolean stringStatus=false;
        for(int i=0;i<str.length();i++){
            int temp=Character.getNumericValue(str.charAt(i));
            if(temp>=0 && temp<=9){
                stringStatus=true;
            }
            else{
                stringStatus=false;
                break;
            }
        }
        if(stringStatus){
            System.out.print("String contain only digit");
        }
        else{
            System.out.println("String contain character");
        }
    }
}
