package consultation.adapter;

public class Water {

    private String brand;

    public Water(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Water{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
