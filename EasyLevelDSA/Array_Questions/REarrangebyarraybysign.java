package EasyLevelDSA.Array_Questions;

import java.util.ArrayList;

public class REarrangebyarraybysign {
    public static void main(String[] args) {
        int[] arr={1,2,-4,-5};
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive.add(arr[i]);
            }
            else{ 
            negative.add(arr[i]);
        }
        }
        for(int i=0;i<arr.length/2;i++){
      
            arr[2*i] = positive.get(i);
            arr[2*i+1] = negative.get(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
