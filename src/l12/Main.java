package l12;

public class Main {

    public static void main(String[] args) {

        Repository repository = new Repository();
        Service service = new Service(repository);
        Controller controller = new Controller(service);

        controller.printMenu();

        Product product = new Product(Category.VEGETABLE);

        switch (product.getCategory()) {
            case FRUIT:
                break;

            case VEGETABLE:
                break;

            case MEAT:
                break;

            case MILK:
                break;
        }

    }

}
