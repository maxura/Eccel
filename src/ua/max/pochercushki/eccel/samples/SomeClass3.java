package ua.max.pochercushki.eccel.samples;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 8/20/13 6:23 PM
 */
public class SomeClass3 {

    private static final String[] footerLinks =
            {"Features, Stories, Pricing, Enterprise, ISV"};

    public static void main(String[] args) {
        StringBuilder strBuild = new StringBuilder();
        for (String footerLink : footerLinks) {
            strBuild.append(footerLink+" ");
        }
        System.out.println(strBuild.toString());
    }

}
