package l10.password;

public class PasswordDemo {

    public static void main(String[] args) {

        Password qawerty = new Password("qawerty");
        System.out.println(qawerty.getValue());
        System.out.println(qawerty.getMaskedValue());

        Password brokenPass = new Password(null);
        System.out.println(brokenPass.getValue());
        System.out.println(brokenPass.getMaskedValue());

    }

}
