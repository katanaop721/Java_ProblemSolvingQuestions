package Binary_Search.Strings;

public class FindNonRepeatesCharacter {
    
        public static void main(String[] args) {
            String str="1122334";
            for(int i=0;i<str.length();i++){
                int count=0;
                for(int j=0;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                        count++;
                    }
                }
                if(count==1){
                    System.out.println("First Non repeated Character: "+ str.charAt(i));
                    return;
                }
            }
            System.out.print("No character found");
            
        }
}
