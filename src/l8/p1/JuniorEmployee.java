package l8.p1;

public class JuniorEmployee extends Employee {

    private boolean trainee;

    public JuniorEmployee(String name, String department) {
        super(name, department);
    }

    @Override
    public void dig() {
        super.dig();
        System.out.println("Ele-kopaet, kosjachit i boitsa");
    }

}
