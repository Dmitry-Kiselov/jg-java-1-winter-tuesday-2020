package lesson2;

public class ProcedureMethodDemo {

    public static void main(String[] args) {

        String name = "Kim 2345";

        meetAndGreet(name);
        meetAndGreet("Charlie");
        meetAndGreet("Donald");
        meetAndGreet("Milnya");

    }

    static void meetAndGreet(String name) {
        System.out.println("Good evening, " + name + ". How are you today?");
    }

}
