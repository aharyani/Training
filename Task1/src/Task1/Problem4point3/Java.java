package Task1.Problem4point3;

public interface Java {
    void print();
    default void show(){
        System.out.println("In Java show");
    }
}
