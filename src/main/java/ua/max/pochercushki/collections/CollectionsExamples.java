package ua.max.pochercushki.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 10/21/13 10:57 AM
 */
public class CollectionsExamples {
    public static void main(String[] args) {
        Random rnd = new Random();
        Map<Integer, String> m = new HashMap<Integer, String>();
        for (int i = 0; i < 10; i++) {
            m.put(i, Integer.toOctalString(rnd.nextInt(256)));
        }
        System.out.println(m.values());

    }
}

