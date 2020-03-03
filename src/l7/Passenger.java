package l7;

public class Passenger {

    private String name;
    private boolean isSick;

    public Passenger(String name, boolean isSick) {
        this.name = name;
        this.isSick = isSick;
    }

    public String getName() {
        return name;
    }

    public boolean isSick() {
        return isSick;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", isSick=" + isSick +
                '}';
    }
}
