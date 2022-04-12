package codegym.oop;

public class Employee extends Department {
    private int id;
    private String fullName;
    private Department department;

    public Employee() {
       // id = 1;
        //fullName="dsgfsadf";
        this(1);
    }

    public Employee(int in) {
        fullName = "";
    }
}
