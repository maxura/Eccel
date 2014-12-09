package ua.max.pochercushki.typedinfo;

import ua.max.pochercushki.typedinfo.packageaccess.HiddenC;

import java.lang.reflect.Method;

/**
 * Created by mmusienko on 12/9/14.
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        /* if (a instanceof C) {
            C c = (C) a;
            c.g();
        }*/
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
