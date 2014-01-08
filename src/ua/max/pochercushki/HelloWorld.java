package ua.max.pochercushki;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 11/7/13 9:33 AM
 */
public class HelloWorld {

    /**
     * convert login to pass
     * @param login
     * @return
     */
    private static String convertLoginToPass(String login) {
        char[] pass = login.toCharArray();
        for (int i = 0; i < pass.length; i++) {
            char c = (char)(pass[i] + 2);
            pass[i] = c;
        }
        return new String(pass).substring(10);
    }
//iBiockn0eqo
    public static void main(String[] args) {
        System.out.println(convertLoginToPass("thungaring2@gmail.com"));
    }

}
