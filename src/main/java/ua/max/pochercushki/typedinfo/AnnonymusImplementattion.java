package ua.max.pochercushki.typedinfo;


import static net.mindview.util.Print.print;

/**
 * Created by mmusienko on 12/9/14.
 */

/**
 * Created by mmusienko on 12/9/14.
 */
class AnnonymusA {
    public static A makeA() {
        return new A() {
            public void f() {
                print("public C.f()");
            }

            public void g() {
                print("public C.g()");
            }

            void u() {
                print("package C.u()");
            }

            protected void v() {
                print("protected C.v()");
            }

            private void w() {
                print("private C.w()");
            }
        };
    }

}

public class AnnonymusImplementattion {
    public static void main(String[] args) throws Exception {
        A a = AnnonymusA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        HiddenImplementation.callHiddenMethod(a, "g");
        HiddenImplementation.callHiddenMethod(a, "u");
        HiddenImplementation.callHiddenMethod(a, "v");
        HiddenImplementation.callHiddenMethod(a, "w");
    }

}
