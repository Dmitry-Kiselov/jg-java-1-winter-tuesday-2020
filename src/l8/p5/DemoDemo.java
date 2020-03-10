package l8.p5;

public class DemoDemo {

    public static void main(String[] args) {

        zolotojGramofon(new DmitryNagiev(), new Singer[]{
                new JohnyDepp(),
                new Gazmanov(),
                new Boyarski(),
        });

        premijaOscar(new MaksimGalkin(), new Actor[]{
                new JohnyDepp(),
                new DmitryNagiev()
        });

    }

    public static void zolotojGramofon(Moderator moderator, Singer[] singers) {
        System.out.println("Zolotoj gramofon: ");
        moderator.moderate();
        for (Singer singer : singers) {
            singer.sing();
        }
    }

    public static void premijaOscar(Moderator moderator, Actor[] actors) {
        System.out.println("Oscar: ");
        moderator.moderate();
        for (Actor actor : actors) {
            actor.act();
        }
    }

}
