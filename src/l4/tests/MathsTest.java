package l4.tests;

public class MathsTest {

    public static void main(String[] args) {

        MathsTest testRunner = new MathsTest();
        testRunner.test1();
        testRunner.test2();

    }

    public void test1() {
        Maths victim = new Maths();

        int a = 5;
        int b = 10;

        int expectedResult = 10;
        int actualResult = victim.max(a, b);

        checkThatEqual(expectedResult, actualResult, "Verify that 10 is greater than 5");
    }

    public void test2() {
        Maths victim = new Maths();

        int a = 25;
        int b = 17;

        int expectedResult = 25;
        int actualResult = victim.max(a, b);

        checkThatEqual(expectedResult, actualResult, "Verify that 25 is greater than 17");
    }

    public void checkThatEqual(int expected, int actual, String scenarioDescription) {
        if (expected == actual) {
            System.out.println("[OK]: " + scenarioDescription + " has passed!");
        } else {
            System.out.println("[NOK]: " + scenarioDescription + " has failed!");
            System.out.println("Expected '" + expected + "', but was '" + actual + "'!");
        }
    }

}
