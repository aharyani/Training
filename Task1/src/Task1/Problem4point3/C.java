package Task1.Problem4point3;

public interface C {
    void print();
    default void show(){
        System.out.println("In C show");
    }
}
