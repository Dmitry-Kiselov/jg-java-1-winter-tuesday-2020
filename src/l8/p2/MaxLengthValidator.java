package l8.p2;

public class MaxLengthValidator implements Validator {

    @Override
    public boolean validate(String text) {
        return text.length() <= 20;
    }

}
