package Task1.Problem1;

public class Student {
    private String firstName;
    private String lastName;
    private int rollNo;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", roll_no=" + rollNo +
                '}';
    }
}
