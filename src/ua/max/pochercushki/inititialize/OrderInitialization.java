package ua.max.pochercushki.inititialize;

import ua.max.pochercushki.print.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 05.11.13
 * Time: 23:40
 * To change this template use File | Settings | File Templates.
 */

class Window {
    Window(int marker) {
        Print.print("Window( " + marker + " )");
    }
}
    class House {
        Window w1 = new Window(1);

        House() {
            Print.print("House()");
            Window w3 = new Window(33);
        }

        Window w2 = new Window(2);

        void f() {
            Print.print("f()");
        }
        Window w3 = new Window(3);
    }

    public class OrderInitialization {
        public static void main(String[] args) {
            House h = new House();
            h.f();
        }
    }



