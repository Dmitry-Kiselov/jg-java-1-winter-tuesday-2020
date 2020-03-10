package l8.p2;

public class PasswordValidator {

    public boolean check(Validator[] rules, String text) {
        for (Validator validator : rules) {
            if (!validator.validate(text)) {
                return false;
            }
        }

        return true;
    }

}
