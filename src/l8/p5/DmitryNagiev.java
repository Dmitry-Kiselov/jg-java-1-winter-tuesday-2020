package l8.p5;

public class DmitryNagiev implements Actor, Moderator {

    @Override
    public void act() {
        System.out.println("Vse poka, poka.. 😎");
    }

    @Override
    public void moderate() {
        System.out.println("Kak govoril moj ded.. Ja tvoj ded..");
    }
}
