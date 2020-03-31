package l11;

public class Parent {

    public static void main(String[] args) {

        //Bootstrap
        A a = new A();
        B b = new B(a);
        C c = new C(b);
        D d = new D(c);

        new D(new C(new B(new A()))); // LOL

    }

}
