package l8.p3;

public class WarcraftDemo {

    public static void main(String[] args) {

        Druid druid = new Druid();
        Shaman shaman = new Shaman();
        JustRegularBear justRegularBear = new JustRegularBear();

        playWolfCharacter(druid);
        playWolfCharacter(shaman);

        System.out.println();
        playBearCharacter(druid);
        playBearCharacter(justRegularBear);

        Wolf wolf = new Druid();
        Wolf wolf2 = new Shaman();

        System.out.println();
        wolf.wolfThing();
        wolf2.wolfThing();
    }

    public static void playWolfCharacter(Wolf wolf) {
        wolf.wolfThing();
    }

    public static void playBearCharacter(Bear bear) {
        bear.bearThings();
    }

}
