package l8.p1;

public class Employee {

    private String name;
    private String department;
    protected int experienceInYears;
    boolean sick;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void dig() {
        System.out.println("Dig like an employee!");
    }

    public void noDig() {
        System.out.println("No dig like an employee!");
    }

    private void readNews() {
        System.out.println("I'm reading DEFLI");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", experienceInYears=" + experienceInYears +
                ", sick=" + sick +
                '}';
    }

}
