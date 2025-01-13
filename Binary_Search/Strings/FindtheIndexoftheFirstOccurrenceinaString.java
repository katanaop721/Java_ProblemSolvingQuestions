package Binary_Search.Strings;

import java.util.ArrayList;

public class FindtheIndexoftheFirstOccurrenceinaString {

//     Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.

    public static void main(String[] anke){
            String haystack = "sadbutsad"; 
            String needle = "sad";
            int haystackptr=0;
            int needleptr=0;
            ArrayList<Integer> arr=new ArrayList<>();

            while(haystackptr<haystack.length()){
                if(haystack.charAt(haystackptr)==needle.charAt(needleptr)){
                    arr.add(haystackptr);
                    haystackptr++;
                    needleptr++;
                }
                else if(haystack.charAt(haystackptr)!=needle.charAt(needleptr)){
                    needleptr=0;
                }
                haystackptr++;
            }
            System.out.println(arr);

    }
}
