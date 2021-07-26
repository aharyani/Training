package Task1.Problem4point3;

public class ProgrammingLanguage implements Java,C{

    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void show() {
        Java.super.show();
    }

}
