package l11;

public class D {

    private final C c; //<--- DEPENDENCY

    public D(C c) { //<--- DEPENDENCY INJECTION
        this.c = c;
    }
}
