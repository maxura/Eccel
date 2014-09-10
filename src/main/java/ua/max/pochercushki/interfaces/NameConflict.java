package ua.max.pochercushki.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 06.08.14
 * Time: 23:58
 * To change this template use File | Settings | File Templates.
 */
interface I1{void f();}
interface I2{int f(int i);}
interface I3{int f();}
class C {
    public int f(){return 1;}
}
class C2 implements I1,I2{

    @Override
    public void f() {
    }

    @Override
    public int f(int i) {
        return 1;
    }
}

class C3 extends C implements I2{

    @Override
    public int f(int i) {
        return 1;
    }
}

class C4 extends C implements I3{
    public int f(int i) {
        return 1;
    }
}

// Methods differ only by return type:
//class C5 extends C implements I1 {}
//! interface I4 extends I1, I3 {} ///:~

public class NameConflict {
}
