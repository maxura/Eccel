package ua.max.pochercushki.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 10/24/13 1:57 PM
 */
public class Redirecting {

    public static void main(String[] args) throws IOException {
        System.out.println("asdasldkasldkaslkaslkasldkasldk");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter("/home/musienkomaxim/tmp/test.out");
        while (in.read()!=0 && in.readLine().length()!=0)
            writer.write(in.readLine());
        in.close();
        writer.close();

    }
}



