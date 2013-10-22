package ua.max.pochercushki.io;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 9/12/13 2:42 PM
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException{
        StringReader in =new StringReader(BufferedInputFile.read("/home/musienkomaxim/maven3/NOTICE.txt"));
        int c;
        while ((c=in.read())!=-1)
            System.out.print((char)c);

    }
}
