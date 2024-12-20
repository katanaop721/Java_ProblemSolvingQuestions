

public class ClassAndObject {
        int id;
        String Name;
        void display(){
            System.out.println(id);
            System.out.println(Name);
        }
    public static void main(String[] args) {
        ClassAndObject emp=new ClassAndObject();
        emp.id=1;
        emp.Name="Anku";
        emp.display();
    }
}
