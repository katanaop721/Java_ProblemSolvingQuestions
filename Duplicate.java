//print the duplicate elements of an array

public class Duplicate{
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5,6,7,8,7};
        boolean ans=false;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){    
            if(array[j]==array[i]){
                    ans=true;
                    break;
                }
            }
        }
        if(ans==true){
            System.out.println("array contain duplicate elemet");
        }
        else{
            System.out.println("array doesn't contain any dupicate element");
        }

    }
}