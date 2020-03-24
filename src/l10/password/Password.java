package l10.password;

public class Password {

    private String value;

    public Password(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Password value must not be null!");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getMaskedValue() {
        return value.replaceAll("a", "*");
    }

}
