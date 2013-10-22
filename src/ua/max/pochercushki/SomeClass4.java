package ua.max.pochercushki;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 8/22/13 10:17 AM
 */
public class SomeClass4 {
    private static String convertLoginToPass(String login) {
        char[] pass = login.toCharArray();
        for (int i = 0; i < pass.length; i++) {
            char c = (char)(pass[i] + 2);
            pass[i] = c;
        }
        return new String(pass).substring(10);
    }

    public static void main(String[] args) {
        System.out.println(convertLoginToPass("thungaring@gmail.com"));
    }
}
