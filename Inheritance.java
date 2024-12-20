class A{
    int id;
    int age;
    void display(){
        System.out.println(id);
        System.out.println(age);
    }
}

class B extends A{
    String name;
    
}
class C extends A{
    
}
public class Inheritance {
        public static void main(String[] args) {
            C b1=new C();
            b1.id=1;
            b1.age=20;
            b1.display();
        }    
}
