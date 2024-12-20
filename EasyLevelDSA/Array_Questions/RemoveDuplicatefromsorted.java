package EasyLevelDSA.Array_Questions;

public class RemoveDuplicatefromsorted {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3};
      //Approach One
        /*   HashSet ans=new HashSet();

        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        System.out.println(ans); */

        //approach two
        int i=0;
            for(int j=1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    i++;
                    arr[i]=arr[j];
                }
            }
               
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]);
        }
    }
}
