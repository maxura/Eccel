package ua.max.pochercushki.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 9/23/13 6:28 PM
 */
public class BasicFileOutput {
    static String file = "/home/musienkomaxim/tmp/out.txt";
    static String Fl   =
            "/home/musienkomaxim/codenvy-qa-project/qa/codenvy-ide-selenium/target/surefire-reports/com.codenvy.ide.preferences" +
            ".HotkeysFormTest.txt";

    public static void main(String[] args)
            throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(Fl)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + "  " + s);
        out.close();
        System.out.println(BufferedInputFile.read(Fl));

    }
}
