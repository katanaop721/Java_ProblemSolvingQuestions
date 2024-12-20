import java.util.ArrayList;
import java.util.HashSet;

public class ExceptionHandling {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(12);
        arr.add(31);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        HashSet h1=new HashSet();
    }   
}
