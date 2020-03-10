package l8.p2;

public class NotEmptyValidator implements Validator {

    @Override
    public boolean validate(String text) {
        return !text.isEmpty();
    }

}
