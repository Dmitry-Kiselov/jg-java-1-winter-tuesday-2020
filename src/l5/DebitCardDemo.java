package l5;

public class DebitCardDemo {

    public static void main(String[] args) {

        DebitCard myDebitCard = new DebitCard();

        System.out.println("myDebitCard.balance = " + myDebitCard.getBalance());

        //Salary.. Yeah boi
        myDebitCard.deposit(1000);

        System.out.println("myDebitCard.balance = " + myDebitCard.getBalance());

        //Friday
        myDebitCard.withdraw(800);

        System.out.println("myDebitCard.balance = " + myDebitCard.getBalance());

        //Birthday
        myDebitCard.withdraw(100);

        System.out.println("myDebitCard.balance = " + myDebitCard.getBalance());

        //Bills.. :-(
        myDebitCard.withdraw(100);

        System.out.println("myDebitCard.balance = " + myDebitCard.getBalance());

        myDebitCard.deposit(-100);

        System.out.println("myDebitCard.balance = " + myDebitCard.getBalance());

        myDebitCard.withdraw(150);

        System.out.println("myDebitCard.balance = " + myDebitCard.getBalance());

    }

}
