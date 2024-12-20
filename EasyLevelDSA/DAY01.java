package EasyLevelDSA;

import java.util.ArrayList;

class DAY01{
    public static void main(String[] args){
        //System.out.println("hello");
        int[] arr={2,5,3,4,8,5,1,3};
        ArrayList<Integer> Ar1=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                Ar1.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                Ar1.add(arr[i]);
            }
        }
    System.out.print(Ar1);
    }
}