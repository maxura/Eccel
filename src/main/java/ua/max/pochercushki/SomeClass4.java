package ua.max.pochercushki;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 8/22/13 10:17 AM
 */
public class SomeClass4 {
    static         String gitUrl      = "https://github.com/idexmai/mavenProjectIDEX.git";
    private static String nameProject = "CustomizeProjectName";
    private static String factoryData =
            "{\"v\":\"1.2\",\"vcs\":\"git\",\"vcsurl\":\"" + gitUrl + "\"," + "\"projectattributes\": {\"pname\":" + "\"" + nameProject +
            "\"" + "}}";


    private static String convertLoginToPass(String login) {
        char[] pass = login.toCharArray();
        for (int i = 0; i < pass.length; i++) {
            char c = (char)(pass[i] + 2);
            pass[i] = c;


        }
        return new String(pass).substring(9);
    }

}
