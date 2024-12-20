public class Encapsulation {
    private int id;
    void setter(int id){
         this.id=id;
    }
    int getter(){
        return id;
    }
    public static void main(String[] args) {
        Encapsulation enc=new Encapsulation();
        enc.setter(3);
        System.out.print(enc.getter());
    }
}
