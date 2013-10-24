package ua.max.pochercushki;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TstCls {
    static String  regexp  = "\\w{40}";
    static Pattern pattern = Pattern.compile(regexp);
    static Matcher matcher;
    static String  commit;
    static StringBuilder build = new StringBuilder();

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://api.github.com/repos/exoinvitemain/factoryUrlRepo/git/refs/heads/master");
        HttpURLConnection connect = (HttpURLConnection)url.openConnection();
        connect.setRequestMethod("GET");
        connect.setDoInput(true);


        while (connect.getInputStream().available() != 0) {

            build.append(((char)connect.getInputStream().read()));
            //String.valueOf((char)connect.getInputStream().read());

        }
        commit = build.toString();
        matcher = pattern.matcher(commit);
        if (matcher.find())
            System.out.println(matcher.group());
        //System.out.println(matcher.group());
        connect.disconnect();

    }
}

