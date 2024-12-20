public class Polymorphism {
    void add(){
        System.out.println("No parameter");
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Polymorphism poly=new Polymorphism();
        poly.add();
        poly.add(1,2);
        poly.add(1,5.4);
    }
}
