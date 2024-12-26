package Array.Array_Questions;

import java.util.ArrayList;

public class MovesZerosToEnd {
    public static void main(String[] args) {
        int[] arr={1,5,0,2,4,0,2,6};
        ArrayList temp=new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }

        for(int i=temp.size();i<arr.length;i++){
            temp.add("0");
        }
        System.out.print(temp);
    }
}
