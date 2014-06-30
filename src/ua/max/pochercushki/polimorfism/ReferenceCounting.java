package ua.max.pochercushki.polimorfism;

import net.mindview.util.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 25.06.14
 * Time: 23:12
 * To change this template use File | Settings | File Templates.
 */
class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        Print.print("Create " + this);
    }

    public void addRef() {
        refCount++;
    }

    protected void dispose() {
        if (--refCount == 0) {
            Print.print("Disposing " + this);
        }
    }

    public String toString() {
        return "Shared " + id;
    }
}


class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        Print.print("Create " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        Print.print("disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        for (Composing c : composing) {
            c.dispose();
        }
    }
}
