package l5.p3;

public class Pelmen {

    private String myaso;
    private String tiesto;

    public Pelmen(String myaso, String tiesto) {
        this.myaso = myaso;
        this.tiesto = tiesto;
    }

    public String getMyaso() {
        return myaso;
    }

    public String getTiesto() {
        return tiesto;
    }

    @Override
    public String toString() {
        return "Pelmen " +
                "myaso='" + myaso + '\'' +
                ", tiesto='" + tiesto + '\'';
    }
}
