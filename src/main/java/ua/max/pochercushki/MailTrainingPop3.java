///*
// * CODENVY CONFIDENTIAL
// * __________________
// *
// *  [2012] - [2013] Codenvy, S.A.
// *  All Rights Reserved.
// *
// * NOTICE:  All information contained herein is, and remains
// * the property of Codenvy S.A. and its suppliers,
// * if any.  The intellectual and technical concepts contained
// * herein are proprietary to Codenvy S.A.
// * and its suppliers and may be covered by U.S. and Foreign Patents,
// * patents in process, and are protected by trade secret or copyright law.
// * Dissemination of this information or reproduction of this material
// * is strictly forbidden unless prior written permission is obtained
// * from Codenvy S.A..
// */
//package ua.max.pochercushki;
//
//import com.sun.mail.pop3.POP3SSLStore;
//
//import java.io.IOException;
//import java.util.Properties;
//import javax.mail.*;
//
///**
// * @author <a href="mmusienko@codenvy.com">Musienko Maxim</a>
// * @version $Id: Aug 6, 2013 2:38:43 PM musienkomaxim $
// */
//public class MailTrainingPop3 {
//    private static Session session = null;
//    private static Store   store   = null;
//    private static String  username, password;
//    private static Folder  folder;
//
//    public static void main(String[] args) throws MessagingException, IOException {
//
//
//        /*
//         * Properties props = System.getProperties(); Session session = Session.getDefaultInstance(props); Store store =
//         * session.getStore("pop3");
//         */
//        String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
//
//        Properties pop3Props = new Properties();
//
//        pop3Props.setProperty("mail.pop3.socketFactory.class", SSL_FACTORY);
//        pop3Props.setProperty("mail.pop3.socketFactory.fallback", "false");
//        pop3Props.setProperty("mail.pop3.port", "995");
//        pop3Props.setProperty("mail.pop3.socketFactory.port", "995");
//
//        URLName url = new URLName("pop3", "pop.gmail.com", 995, "",
//                                  username, password);
//
//        session = Session.getInstance(pop3Props, null);
//        store = new POP3SSLStore(session, url);
//
//
//        try {
//            store.connect("pop.gmail.com", "musienko.maxim", "vfrcbv_1978");
//            Folder folder = store.getFolder("inbox");
//            Folder[] lstFolders = store.getDefaultFolder().list("*");
//            // folder.open(Folder.READ_ONLY);
//            // Message[] msgs = folder.getMessages();
//            System.out.println("**********:" + lstFolders.length);
//
//            for (int i = 0; i < lstFolders.length; i++) {
//                System.out.println("<<<<<<<<<<<<<:" + lstFolders[i].getFullName());
//            }
//
//
//        } catch (NoSuchProviderException e) {
//            e.printStackTrace();
//        } finally {
//            store.close();
//        }
//    }
//}
