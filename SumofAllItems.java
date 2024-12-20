
import java.util.ArrayList;

public class SumofAllItems {
    public static void main(String[] args){

        ArrayList<Integer> arr=new ArrayList<Integer>();
        int sum=0;
        arr.add(1);
        arr.add(2);
        arr.add(8);
        arr.add(6);
        arr.add(3);
        for(int i=0;i<arr.size();i++){
            sum=sum+arr.get(i);
        }
        System.out.println(sum);
    }
}
