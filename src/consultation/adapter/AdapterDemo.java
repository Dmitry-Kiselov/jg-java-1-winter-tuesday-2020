package consultation.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        Adapter<Water, Wine> waterWineAdapter = new WaterToWineAdapter();

        Water water = new Water("Evian");
        Wine wine = waterWineAdapter.adapt(water);

        System.out.println(" --- ");
        System.out.println("water = " + water);
        System.out.println("wine = " + wine);

        Adapter<String, Water> stringWaterAdapter = new StringWaterAdapter();

        Water zakumuiza = stringWaterAdapter.adapt("Zakumuiza");
        Water venden = stringWaterAdapter.adapt("Venden");

        System.out.println("zakumuiza = " + zakumuiza);
        System.out.println("venden = " + venden);

    }

}
