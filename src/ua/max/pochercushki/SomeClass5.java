package ua.max.pochercushki;

import java.util.Map;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 11/6/13 5:39 PM
 */
public class SomeClass5 {

    private static String pushConflictMessage =
            "! [rejected]        master -> master (non-fast-forward)\n" +
            "error: failed to push some refs to 'git@github.com:exoinvitemain/testRepo.git'\n" +
            "To prevent you from losing history, non-fast-forward updates were rejected\n" +
            "Merge the remote changes (e.g. 'git pull') before pushing again.  See the\n" +
            "'Note about fast-forwards' section of 'git push --help' for details.";



    public static void main(String[] args) {
        System.out.println( pushConflictMessage = pushConflictMessage.replaceAll("exoinvitemain", "codenvymain"));
    }


}
