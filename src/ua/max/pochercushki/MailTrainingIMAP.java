/*
 * CODENVY CONFIDENTIAL
 * __________________
 *
 *  [2012] - [2013] Codenvy, S.A.
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package ua.max.pochercushki;


import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailTrainingIMAP {
    private static String user = "tarrantella";

    private static String password = "Vfrcbv_1978";
    private static Store mailStore;

    private String tenantName;

   // private static Store mailStore;

    private static Folder mailBoxFolder;

    protected String host = "imap.gmail.com";

    private Pattern pattern;

    private Matcher matcher;


    /**
     * Creates session with email server with using IMAP - mail protocol. Return array messages
     *
     * @param user
     * @param password
     * @return
     * @throws
     * @throws MessagingException
     */
    private javax.mail.Message[] receiveInviteEmail(String user, String password) throws MessagingException {
        Properties properties = System.getProperties(); // Get system properties
        Session session = Session.getDefaultInstance(properties); // Get the default Session object.
        mailStore = session.getStore("imaps"); // Get a Store object that implements the specified protocol.
        javax.mail.Message[] msgs = null;
        Folder folder = null;
        try {
            mailStore.connect(host, user,
                              password); //Connect to the current host using the specified username and password.
            mailBoxFolder = mailStore.getFolder("inbox"); //Create a Folder object corresponding to the given name.
            mailBoxFolder.open(Folder.READ_ONLY); // Open the Folder.
            msgs = mailBoxFolder.getMessages();

        }

        catch (Exception e) {
            e.printStackTrace();
        }
        return msgs;
    }


    public static void main(String[] args) throws MessagingException, IOException {
        MailTrainingIMAP inst = new MailTrainingIMAP();

        Message[]msgs =inst.receiveInviteEmail(user, password);
        for (Message msg : msgs) {
            System.out.println(msg.getContent().toString());
        }
        mailStore.close();
    }

    //  }

    //
//
//
//
//    public String getConfirmLink(String subject, String tenantName)
//            throws MessagingException, IOException, PatternSyntaxException, TimeoutException {
//        Date date = new Date(0);
//        String msg = null;
//        String confirmLink = "";
//        Message[] messages = receiveInviteEmail(user, password);
//        for (int i = 0; i < messages.length; i++) {
//            if (messages[i].getSubject().equals(subject) &&
//                (messages[i].getContent().toString().contains(tenantName))
//                && messages[i].getReceivedDate().before(new Date())) {
//                msg = messages[i].getContent().toString();
//                try {
//                    String linkPattern = "(http|https)://" + "codenvy-dev.com" + "setup-password?id="+
//                                         "\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}";
//                    pattern = Pattern.compile(linkPattern);
//                    matcher = pattern.matcher(msg);
//
//                    while (matcher.find()) {
//                        confirmLink = matcher.group();
//                    }
//
//                } catch (StringIndexOutOfBoundsException e) {
//                    throw new StringIndexOutOfBoundsException("Unable found the string in the message : " + msg);
//                } catch (PatternSyntaxException e) {
//                    e.printStackTrace();
//                } finally {
//                    mailBoxFolder.close(true);
//                    mailStore.close();
//                }
//            }
//        }
//
//
//
//
}

