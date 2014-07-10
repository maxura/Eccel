package ua.max.pochercushki.polimorfism;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 03.07.14
 * Time: 23:34
 * To change this template use File | Settings | File Templates.
 */


class Useful {
    public void f() {

    }

    public void g() {

    }
}

class MoreUseful extends Useful {
    public void f() {

    }

    public void g() {

    }

    public void u() {

    }

    public void v() {

    }

    public void w() {

    }
}

public class RTTI {
    public static void main(String[] args) {
        Useful [] x ={new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();
       // x[1].u;
        ((MoreUseful)x[1]).u();
        ((MoreUseful)x[0]).u();
    }


}
