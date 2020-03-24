package l10;

import java.io.IOException;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Before Try");

        try {

            System.out.println(getMessageOfTheDay("C:/Program Files"));
            System.out.println(getMessageOfTheDay(""));

        } catch (IOException ex) {

            System.out.println("An error occurred: " + ex.getMessage());
            ex.printStackTrace();

        } finally {
            System.out.println("This is finally block which gets executed regardless");
        }

        System.out.println("After Try");

    }

    private static String getMessageOfTheDay(String path) throws IOException {
        if (path.isEmpty()) {
            throw new IOException("Could not find the file");
        }

        return "Stay safe";
    }

}
