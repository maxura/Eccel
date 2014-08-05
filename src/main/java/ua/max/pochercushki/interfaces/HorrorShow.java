package ua.max.pochercushki.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 06.08.14
 * Time: 0:24
 * To change this template use File | Settings | File Templates.
 */
interface Monster {
    void menance();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Letal {
    void kill();
}

class DragonZilla implements DangerousMonster {

    @Override
    public void destroy() {
    }

    @Override
    public void menance() {
    }
}

interface Vampire extends DangerousMonster, Letal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {

    @Override
    public void drinkBlood() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void kill() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void menance() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

public class HorrorShow {
    static void u(Monster b) {
        b.menance();
    }

    static void v(DangerousMonster d) {
        d.menance();
        d.destroy();
    }

    static void w(Letal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad =new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }

}
