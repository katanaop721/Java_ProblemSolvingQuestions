package Binary_Search.Strings;

public class Reverseastringpreservingspacepositions {
    public static void main(String[] args) {
        String str="Help others";
        StringBuilder ans=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){ 
                ans.append(str.charAt(i-1));
                ans.append(" "); 
                i--;   
            }
            else{ 
            ans.append(str.charAt(i));
        }
    }
        System.out.println(ans);
    }
}

// Input  : "abc de"
// Output : edc ba

// Input : "intern at geeks"
// Output : skeegt an retni

// Input : "Help others"
// Output : sreh topleH