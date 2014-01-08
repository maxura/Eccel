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


    //https://codenvy-dev.com/factory?id=sw6doyfn96lg1oua

    private String linkPattern =
            "(http|https)://" + "codenvy-dev.com" + "/site/auth/create.*?" + "bearertoken=([A-Za-z0-9]).*\\&.*\"";
    //"(http|https):////"+"codenvy-dev.com"+".*"+"setup-password"+".*"+"id="+"\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}";

    String testText =
            "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"636\" bgcolor=\"#FFFFFF\" align=\"center\"\n" +
            "       style=\"font-size: 12px;color:#666666;line-height:20px;font-family:verdana,arial,tahoma;\">\n" +
            "    <tr bgcolor=\"#FFFFFF\">\n" +
            "        <td align=\"center\" valign=\"middle\" bgcolor=\"#FFFFFF\" style=\"border:1px solid #E1E1E1;border-bottom:none;\">\n" +
            "            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"92%\" bgcolor=\"#FFFFFF\" align=\"center\"\n" +
            "                   style=\"font-size: 12px;color:#666666;line-height:20px;font-family:'HelveticaNeue Light',verdana,arial," +
            "tahoma\">\n" +
            "                <tr>\n" +
            "                    <td align=\"left\">\n" +
            "                        <h1 style=\"margin:20px 0 15px 0;padding:0\">\n" +
            "                            <a href=\"http://codenvy-dev.com\"\n" +
            "                               target=\"_blank\"\n" +
            "                               style=\"font-family:'HelveticaNeue Light',arial,tahoma," +
            "serif;color:#222222;font-size:24px;text-decoration:none;font-weight:normal;\"\n" +
            "                               title=\"Welcome to Codenvy!\">Welcome to Codenvy!</a>\n" +
            "                        </h1>\n" +
            "                    </td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "    </tr>\n" +
            "\n" +
            "    <!--- body -->\n" +
            "\n" +
            "    <tr bgcolor=\"#FFFFFF\">\n" +
            "        <td align=\"center\" bgcolor=\"#FFFFFF\" style=\"border: 1px solid #E1E1E1; border-top: none; border-bottom: none;" +
            "\">\n" +
            "            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"92%\"\n" +
            "                   bgcolor=\"#FFFFFF\" align=\"center\"\n" +
            "                   style=\"font-size: 12px; color:#222222;line-height:20px;font-family:'HelveticaNeue Light',verdana,arial," +
            "tahoma;\">\n" +
            "                <tr>\n" +
            "                    <td align=\"left\">\n" +
            "                        <p style=\"font-family: LucidaGrande,verdana,arial,tahoma;font-size:12px;color:#222222\">\n" +
            "                            To confirm your request to create a new Codenvy account, please click here:\n" +
            "                        </p>\n" +
            "                        <center>\n" +
            "                            <a href=\"http://codenvy-dev" +
            ".com/site/auth/create?workspace=selenium3&username=exoinvitesingle@gmail" +
            ".com&bearertoken=TujO8TaDe9qr&projectid=d29ya3NwYWNlanFndTB5eGx0cWhlZWFhYTovdGVzdFRlbmFudENyZWF0aW9u:testTenantCreation" +
            "&projectid=d29ya3NwYWNlanFndTB5eGx0cWhlZWFhYTovdGVzdFRlbmFudENyZWF0aW9uMjIy:testTenantCreation222&downloadurl=http://codenvy" +
            "-dev.com/ide/rest/tmp-0inlmjusjgt4kq/vfs/v2/export/\"\n" +
            "                               target=\"_blank\"\n" +
            "                               style=\"font-family: Myriad Pro, arial, tahoma, serif; color: #fff; font-size: 14px; " +
            "text-decoration: none; font-weight: bold;\"\n" +
            "                               title=\"Confirm tenant creation\">\n" +
            "                                <div style=\"font-family: 'Lucida Grande', sans-serif; box-shadow: inset 0px 0px 2px " +
            "#FFFFFF; -moz-box-shadow: inset 0px 0px 2px #FFFFFF; khtml-box-shadow: inset 0px 0px 2px #FFFFFF; webkit-box-shadow: inset " +
            "0px 0px 2px #FFFFFF; ms-box-shadow: inset 0px 0px 2px #FFFFFF; border-radius: 5px; moz-border-radius: 5px; " +
            "khtml-border-radius: 5px; o-border-radius: 5px; webkit-border-radius: 5px; ms-border-radius: 5px; width: 120px; height: " +
            "40px; line-height: 40px; border: 1px solid #577e15; color: #fff; text-align: center; background: #e77431; margin: 15px 0 " +
            "15px\">\n" +
            "                                    Confirm\n" +
            "                                </div>\n" +
            "                            </a>\n" +
            "                        </center>\n" +
            "\n" +
            "                        <p style=\"font-family:LucidaGrande,verdana,arial,tahoma;font-size:12px;margin:10px 0 20px 0;" +
            "line-height:20px;color:#222222;\">\n" +
            "                            Once confirmed, we will set up your Codenvy workspace at http://codenvy-dev.com/ide/selenium3. " +
            "This might take a minute or two.</p>\n" +
            "\n" +
            "                        <p style=\"font-family:'HelveticaNeue Light',verdana,arial,tahoma;font-size:14px; margin:10px 0 15px" +
            " 0;line-height:20px;color:#222222\">\n" +
            "                            <strong>The Codenvy Team</strong>\n" +
            "                        </p>\n" +
            "                    </td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "    </tr>\n" +
            "\n" +
            "    <!-- footer -->\n" +
            "\n" +
            "    <tr>\n" +
            "        <td bgcolor=\"#4a6881\" height=\"160\">\n" +
            "            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\"\n" +
            "                   style=\"font-size: 12px;color:#666666;line-height:20px;font-family:verdana,arial,tahoma\">\n" +
            "                <tr>\n" +
            "                    <td align=\"left\" valign=\"top\"\n" +
            "                        style=\"font-family:Verdana,arial,tahoma,serif;color:#FFFFFF;font-size:12px;padding:20px 0 20px " +
            "30px;width: 294px\">\n" +
            "                        <h3>\n" +
            "                            <a href=\"http://codenvy-dev.com\"\n" +
            "                               target=\"_blank\"\n" +
            "                               style=\"font-family:'HelveticaNeue Light',arial,tahoma," +
            "serif;color:#FFFFFF;font-size:18px;text-decoration:none;font-weight:normal;\"\n" +
            "                               title=\"What is Codenvy?\">What is Codenvy?</a>\n" +
            "                        </h3>\n" +
            "\n" +
            "                        <div style=\"font-family:'LucidaGrande bold',verdana,arial,tahoma;font-size:12px;line-height:22px;" +
            "\">\n" +
            "                            Codenvy is a cloud environment for coding, building, and debugging apps.\n" +
            "                            We use cloud's infinite resources to make your development tasks shorter.\n" +
            "                        </div>\n" +
            "                    </td>\n" +
            "                    <td align=\"right\">\n" +
            "                        <img src=\"http://codenvy-dev.com/site/images/email/invitation/codenvy-ide.png\" alt=\"Codenvy\"/>\n" +
            "                    </td>\n" +
            "\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "    </tr>\n" +
            "</table>\n";
//
//    String testText2 =
//            "I would like to share with you my project FactoryTests on Codenvy:https://codenvy-dev.com/factory?v=1" +
//            ".0&pname=FactoryTests&wname=exoinvitemain&vcs=git&vcsurl=http%3A%2F%2Fcodenvy-dev" +
//            ".com%2Fgit%2Fd5%2Ffb%2F3b%2Fworkspaced5qz7gsciamumdb1%2FFactoryTests&idcommit=9f2590bb8a5ef0831999498fdd9c669a493ec601" +
//            "&action=openproject&ptype=Spring Please contact me in case of any questions.Enjoy coding in the cloud!main " +
//            "codenvyexoinvitemain@gmail.com";


    public void setPattern() {
        pattern = Pattern.compile(linkPattern);

    }

    public void setMatcher(String inSt) {
        mtch = pattern.matcher(inSt);
    }


    public String catLinks() {

        String str = null;
        while (mtch.find()) {
            str = mtch.group().replace(" style", " ");

        }
        return str;
    }


    public static void main(String[] args) {

        RegxpExperementation tst = new RegxpExperementation();
        tst.setPattern();
        tst.setMatcher(tst.testText);
        System.out.println("***********************:" + tst.catLinks());
    }
}
