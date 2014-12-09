package ua.max.pochercushki.typedinfo.packageaccess;

import net.mindview.util.Print;
import ua.max.pochercushki.typedinfo.A;

/**
 * Created by mmusienko on 12/9/14.
 */
class C implements A {
    public void f() {
        Print.print("public C.f()");
    }

    public void g() {
        Print.print("public C.g()");
    }


    void u() {
        Print.print("package C.u()");
    }


    void v() {
        Print.print("protected C.v()");
    }

    private void w() {
        Print.print("private C.w()");
    }
}

public class HiddenC {
    public static A makeA() {
        return new C();
    }
}
