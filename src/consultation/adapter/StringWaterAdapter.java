package consultation.adapter;

public class StringWaterAdapter implements Adapter<String, Water> {

    @Override
    public Water adapt(String s) {
        return new Water(s);
    }

}
