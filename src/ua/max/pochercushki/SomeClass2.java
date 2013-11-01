package ua.max.pochercushki;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 8/15/13 2:07 PM
 */
public class SomeClass2 {
    public static void main(String[] args) {
        File fl = new File("TstCls.java");
        System.out.println("<<<<<<<<<<<<<<<<:"+fl.getAbsoluteFile());
        System.out.println("****************:"+fl.hashCode());
    }
    }

