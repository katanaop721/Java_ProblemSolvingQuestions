
public class Median {
    public static void main(String[] args){
        int[] nums1 ={1,2};
		int[] nums2 ={3};
        int[] Arr={};
        int m=nums1.length;
        int n=nums2.length;
        int ptr=0;
        //ArrayList Arr= new ArrayList();
        int ptr1=0;
        int ptr2=0;
        while(nums1<=m || nums2<=n){
            Arr[ptr]=nums1[i=ptr];

        }
        // for(int i=0;i<nums1.length;i++){
        //     Arr[i]=nums1[i];
        //     //Arr.add(nums1[i]);
        //     ptr++;
        // }
        // for(int i=0;i<nums2.length;i++){
        //     Arr[ptr]=nums2[i];
        //    // ptr++;
        //     //Arr.add(nums2[i]);
        // }
        //Arrays.sort(Arr);
        //Sorting the array
        for(int i=0;i<Arr.length;i++){
            for(int j=i+1;j<Arr.length;j++){
                if(Arr[i]>Arr[j]){
                    int temp=Arr[i];
                    Arr[i]=Arr[j];
                    Arr[j]=temp;
                }
            }
        }
        System.out.println(Arr[Arr.length/2]);
        
    }
}
