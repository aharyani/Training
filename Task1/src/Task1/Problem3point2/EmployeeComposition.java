package Task1.Problem3point2;

public class EmployeeComposition {

    //composition has-a relationship
    private Job job;


    public EmployeeComposition(){
        this.job=new Job();
        job.setSalary(1000);
    }
    public int getSalary() {
        return job.getSalary();
    }
}
