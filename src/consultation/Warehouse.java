package consultation;

public class Warehouse<T> {

    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "object=" + object +
                '}';
    }
}
