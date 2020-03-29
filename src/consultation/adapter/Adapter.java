package consultation.adapter;

public interface Adapter<IN, OUT> {

    OUT adapt(IN in);

}
