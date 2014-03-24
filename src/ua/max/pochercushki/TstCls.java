package ua.max.pochercushki;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Dd {
    public String testM(String str) {
        return str.trim().toUpperCase();
    }
}

public class TstCls {
    static String  regexp  = "\\w{40}";
    static Pattern pattern = Pattern.compile(regexp);
    static Matcher matcher;
    static String  commit;
    static StringBuilder build = new StringBuilder();

    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("/home/musienkomaxim/tmp/big.txt");
        for (int i = 1; i < 350; i++) {
            fr.write("public void testM_" + i + "(String str)\n{\n" +
                     "        str.getBytes();\n" +
                     "}\n\n" + "public String testMR_" + i + "(String str)\n{\n" +
                     "     return    str.trim().toUpperCase();\n" +
                     "}\n\n"
                    );
fr.flush();
        }

    }
}

