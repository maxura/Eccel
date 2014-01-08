package ua.max.pochercushki;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 8/8/13 6:06 PM
 */
public class TestMess {
    public static String getLink(String searchingString) throws Exception {
        String msg = "<td align=\"left\">\n" +
                     "<p style=\"font-family: LucidaGrande,verdana,arial,tahoma; font-size: 12px; color: #222222;\">\n" +
                     "<center>\n" +
                     "<a title=\"Accept invitation\" style=\"font-family: Myriad Pro, arial, tahoma, " +
                     "serif; color: #fff; font-size: 14px; text-decoration: none; font-weight: bold;\" target=\"_blank\" " +
                     "href=\"http://piston.codenvy-stg.com/rest/musienkomaxim/invite/activate/invitation2emmusmjh2x0d4ky\">\n" +
                     "<div style=\"font-family: 'Lucida Grande', sans-serif; border-radius: 5px; width: 210px; height: 40px; line-height:" +
                     " 40px; border: 1px solid #577e15; color: #fff; text-align: center; background: #e77431; margin: 15px 0 15px;\"> " +
                     "Accept Invitation </div>\n" +
                     "</a>\n" +
                     "</center>\n" +
                     "<p style=\"font-family: LucidaGrande,verdana,arial,tahoma; font-size: 12px; color: #222222;\">You can access the " +
                     "IDE at any time using the following credentials:</p>\n" +
                     "<p style=\"font-family: LucidaGrande,verdana,arial,tahoma; font-size: 12px; color: #222222;\">\n" +
                     "<p style=\"font-family: LucidaGrande,verdana,arial,tahoma; font-size: 12px; color: #222222;\">Once logged in, " +
                     "you can try one of our sample apps or browse other users' projects.</p>\n" +
                     "<p style=\"font-family: LucidaGrande,verdana,arial,tahoma; font-size: 12px; color: #222222;\">Have fun coding in " +
                     "the cloud.</p>\n" +
                     "<p style=\"font-family: 'HelveticaNeue Light',verdana,arial,tahoma; font-size: 14px; margin: 10px 0 15px 0; line-height: 20px; color: #222222;\">\n" +
                     "</td>";
        try {
            int startInd = msg.indexOf(searchingString);

            System.out.println("<<<<<<<<<<" + startInd);
            int endInd = msg.indexOf("\"", startInd + 5);

            System.out.println("<<<<<<<<<<" + endInd);
            msg = msg.substring(startInd, endInd);

        } catch (StringIndexOutOfBoundsException e) {
            throw new StringIndexOutOfBoundsException("Unable found the string in the message : " + msg);
        }


        return msg.equals("null") ? null : msg;
    }


    public static void main(String[] args) throws Exception {
        System.out.println(new Date());
    }

}



