package l12;

public class Service {

    private final Repository repository; //DEPENDENCY

    public Service(Repository repository) { //DEPENDENCY INJECTION
        this.repository = repository;
    }
}
