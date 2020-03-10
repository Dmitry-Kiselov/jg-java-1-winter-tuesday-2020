package l8.p2;

public class MinLengthValidator implements Validator {

    @Override
    public boolean validate(String text) {
        return text.length() >= 8;
    }

}
