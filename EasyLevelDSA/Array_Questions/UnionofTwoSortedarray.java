package EasyLevelDSA.Array_Questions;

import java.util.ArrayList;

public class UnionofTwoSortedarray {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
        int[] arr2 ={2,3,4,4,5,11,12};
        //Approach 1
        // HashSet<Integer> ansHash=new HashSet<>();
        // for(int i=0;i<arr1.length;i++){
        //     ansHash.add(arr1[i]);
        // }
        // for(int i=0;i<arr2.length;i++){
        //     ansHash.add(arr2[i]);
        // }
        // System.out.println(ansHash);
        
        //Appproach 2
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int ptr1=0;
        int ptr2=0;
        while(ptr1<arr1.length || ptr2<arr2.length){
            if(ptr1<arr1.length && ptr2 <arr2.length){ 
            
            if(arr1[ptr1]==arr2[ptr2]){
                ans.add(arr1[ptr1]);
                ptr1++;
                ptr2++;
            }
            else if(arr1[ptr1]<arr2[ptr2]){
                ans.add(arr1[ptr1]);
                ptr1++;
            }

            else{
                ans.add(arr2[ptr2]);
                ptr2++;
            }
        }
            else if(ptr1!=arr1.length){
                ans.add(arr1[ptr1]);
                ptr1++;
            }
            else if(ptr2!=arr2.length){
                ans.add(arr2[ptr2]);
                ptr2++;
            }
        
        
    }
System.out.println(ans);
        

    }
}
