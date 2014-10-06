package ua.max.pochercushki.typedinfo;

import com.sun.java.util.jar.pack.*;

/**
 * Created by mmusienko on 10/2/14.
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        intClass = double.class;
        //genericIntClass = double.class;
    }

}
