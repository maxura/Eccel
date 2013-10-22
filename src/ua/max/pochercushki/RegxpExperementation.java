package ua.max.pochercushki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 8/9/13 2:26 PM
 */
public class RegxpExperementation {

    static final String domain = "codenvy-dev.com";

    static final String tenantName = "musienkotarrantella";


    private Pattern pattern;
    private Matcher mtch;


    //  private String linkPattern = "(http|https):////"+".*" + "codenvy-dev.com" +".*"+ "setup-password" +"id="+
    //                             "\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}";

    private String linkPattern = "(http|https)://" + "codenvy-dev.com" + "/" + ".*" + "openproject&ptype=Spring ";
    //"(http|https):////"+"codenvy-dev.com"+".*"+"setup-password"+".*"+"id="+"\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}";

    String testText = "";

    String testText2 =
            "I would like to share with you my project FactoryTests on Codenvy:https://codenvy-dev.com/factory?v=1" +
            ".0&pname=FactoryTests&wname=exoinvitemain&vcs=git&vcsurl=http%3A%2F%2Fcodenvy-dev" +
            ".com%2Fgit%2Fd5%2Ffb%2F3b%2Fworkspaced5qz7gsciamumdb1%2FFactoryTests&idcommit=9f2590bb8a5ef0831999498fdd9c669a493ec601" +
            "&action=openproject&ptype=Spring Please contact me in case of any questions.Enjoy coding in the cloud!main " +
            "codenvyexoinvitemain@gmail.com";


    public void setPattern() {
        pattern = Pattern.compile(linkPattern);

    }

    public void setMatcher(String inSt) {
        mtch = pattern.matcher(inSt);
    }


    public String catLinks() {

        String str = null;
        while (mtch.find()) {
            str = mtch.group();

        }
        return str;
    }


    public static void main(String[] args) {

        RegxpExperementation tst = new RegxpExperementation();
        tst.setPattern();
        tst.setMatcher(tst.testText2);
        System.out.println("***********************:" + tst.catLinks());
    }
}
