package Task1.Problem3point2;

public class EmployeeDetailComposition {
    int id;
    String name ;
    Address address = new Address();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String postal_code,String street){
        address.postal_code = postal_code;
        address.street = street;
    }

    @Override
    public String toString() {
        return "EmployeeDetailComposition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
