package l8.p1;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee yegor = new Employee("Yegor", "IT");
        JuniorEmployee juniorEmployee = new JuniorEmployee("Igor", "Finance");

        System.out.println("Employee:");
        yegor.dig();
        yegor.noDig();

        System.out.println();
        System.out.println("Junior Employee:");
        juniorEmployee.dig();
        juniorEmployee.noDig();

        System.out.println();
        System.out.println(yegor);
        System.out.println(juniorEmployee);

        SeniorEmployee seniorEmployee = new SeniorEmployee("Vasya", "Laws", 5000);
        seniorEmployee.drinkCofee();

    }

}
