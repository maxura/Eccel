package ua.max.pochercushki;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 11/6/13 5:39 PM
 */
public class SomeClass5 {

    private static final String DEPENDENCY = "exoinvitemain@gmail.com";


    public static void main(String[] args) {
        System.out.println(DEPENDENCY.substring(0, DEPENDENCY.indexOf("@")));
        for (int i = 0; i < 3; i++)
            System.out.println("<<<<<<<<<<<:" + i);
        System.out.println("dlkgjklgjjlj");


    }


}
