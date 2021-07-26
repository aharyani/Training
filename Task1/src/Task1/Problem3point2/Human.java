package Task1.Problem3point2;

public class Human {
    private String eyes;
    private final Heart heart;
    private String lungs;

    public Human(String eyes, String lungs){
        heart = new Heart();
    }


    @Override
    public String toString() {
        return "Human{" +
                "eyes='" + eyes + '\'' +
                ", heart=" + heart +
                ", lungs='" + lungs + '\'' +
                '}';
    }
}
