package consultation.adapter;

public class Wine {

    private String brand;

    public Wine(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
