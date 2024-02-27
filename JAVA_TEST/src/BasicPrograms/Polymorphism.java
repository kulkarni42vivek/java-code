package BasicPrograms;

// there are two types of the polymorphism - compile time , runtime
class Car{
    void running(){
        System.out.println("Car is running");
    }
}
class Honda extends Car{
    void running(){
        System.out.println("honda is running");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Car obj = new Honda();
        obj.running();
    }
}
