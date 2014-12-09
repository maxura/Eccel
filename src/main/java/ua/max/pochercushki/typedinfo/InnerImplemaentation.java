package ua.max.pochercushki.typedinfo;

import net.mindview.util.Print;

/**
 * Created by mmusienko on 12/9/14.
 */
class InnerA {
    private static class C implements A {
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

    public static A makeA() {
        return new C();
    }
}

public class InnerImplemaentation {
    public static void main(String[] args) throws Exception {
        A a = InnerA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        HiddenImplementation.callHiddenMethod(a, "g");
        HiddenImplementation.callHiddenMethod(a, "u");
        HiddenImplementation.callHiddenMethod(a, "v");
        HiddenImplementation.callHiddenMethod(a, "w");
    }

}

