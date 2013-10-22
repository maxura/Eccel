package ua.max.pochercushki.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 9/13/13 1:12 PM
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {

        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(BufferedInputFile.read("/home/musienkomaxim/tmp/today/surefire-report.html").getBytes()));
            while (in.available() != 0)
                System.out.print((char)in.readByte());
        } catch (EOFException e) {
            System.err.print("End of file");
        }


    }
}
