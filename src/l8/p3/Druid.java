package l8.p3;

public class Druid implements Wolf, Bear, Cat {

    @Override
    public void bearThings() {
        System.out.println("Doing bear things like a druid");
    }

    @Override
    public void catThings() {
        System.out.println("Doing cat things like a druid");
    }

    @Override
    public void wolfThing() {
        System.out.println("Doing wolf things like a druid");
    }

}
