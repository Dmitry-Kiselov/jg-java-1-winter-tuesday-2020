package consultation.adapter;

public class WaterToWineAdapter implements Adapter<Water, Wine> {

    @Override
    public Wine adapt(Water water) {
        System.out.println("Adapting water " + water + " to wine!");
        System.out.println("* Magic happens *");

        return new Wine(water.getBrand());
    }

}
