package l12;

public class Controller {

    private final Service service; //DEPENDENCY

    public Controller(Service service) { //DEPENDENCY INJECTION
        this.service = service;
    }

    public void printMenu() {
        System.out.println("Select your action!");
        System.out.println("1. Create new product..");
    }

}
