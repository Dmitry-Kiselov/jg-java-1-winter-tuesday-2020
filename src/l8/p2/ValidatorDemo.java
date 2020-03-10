package l8.p2;

public class ValidatorDemo {

    public static void main(String[] args) {

        System.out.println("isValidPassword(\"abcd\") = " + isValidPassword("abcd"));
        System.out.println("isValidPassword(\"qwerty12345\") = " + isValidPassword("qwerty12345"));
        System.out.println("isValidPassword(\"\") = " + isValidPassword(""));
        System.out.println("isValidPassword(\"Quick Brown Fox Jumped OVer The Lazy Dog\") = " + isValidPassword("Quick Brown Fox Jumped OVer The Lazy Dog"));

    }

    private static boolean isValidPassword(String password) {
        NotEmptyValidator notEmptyValidator = new NotEmptyValidator();
        MinLengthValidator minLengthValidator = new MinLengthValidator();
        MaxLengthValidator maxLengthValidator = new MaxLengthValidator();

        Validator[] rules = {
                notEmptyValidator,
                minLengthValidator,
                maxLengthValidator
        };

        PasswordValidator validator = new PasswordValidator();
        return validator.check(rules, password);


//        for (Validator validator : rules) {
//            if (!validator.validate(password)) {
//                return false;
//            }
//        }
//
//        return true;
    }

}
