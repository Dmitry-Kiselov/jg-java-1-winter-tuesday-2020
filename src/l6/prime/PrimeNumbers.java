package l6.prime;

public class PrimeNumbers {

    public void primesInRange(int from, int to) {
        int sum = 0;
        int count = 0;

        for (int i = from; i <= to; i++) {
            if (i == 17 || i == 71) {
                continue;
            }

            if (count == 50) {
                break;
            }

            if (isPrime(i)) {
                sum += i;
                count++;
            }
        }

        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
