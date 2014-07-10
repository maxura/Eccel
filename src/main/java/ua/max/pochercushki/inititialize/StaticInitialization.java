package ua.max.pochercushki.inititialize;

import ua.max.pochercushki.print.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 11.11.13
 * Time: 0:24
 * To change this template use File | Settings | File Templates.
 */

class Bowl {
    Bowl(int marker) {
        Print.print("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        Print.print("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        Print.print("Table");
        bowl1.f1(1);
    }

    void f2(int marker) {
        Print.print("f2(" + marker + ")");
    }

    static Bowl bow2 = new Bowl(2);
}

class CupBoard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    CupBoard() {
        Print.print("CupBoard");
        bowl4.f1(2);
    }

    void f3(int marker) {
        Print.print("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args) {
        Print.print("Creating new object Cupboard in main()");
        new CupBoard();

        Print.print("Creating new object Cupboard in main()");
        new CupBoard();

        table.f2(1);
        cupBoard.f3(1);
    }

    static Table table = new Table();
    static CupBoard cupBoard = new CupBoard();
}