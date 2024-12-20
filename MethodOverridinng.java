 
class bank{
    int roi(){
        return 0;
    }
}
class sbi extends bank{
    int roi(){
        return 10;
    }
}
class icici extends bank{
    int roi(){
        return 20;
    }
}

public class MethodOverridinng {
    public static void main(String[] args) {
    sbi s1=new sbi();
    System.out.println(s1.roi());
    icici ic1=new icici();
    System.out.println(ic1.roi());

}
}
