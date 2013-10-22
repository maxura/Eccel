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
//        String ttStr =
//                "https://codenvy-dev.com/factory?v=1.0&pname=factoryUrlRepo&wname=musienko
// .maxim&vcs=git&vcsurl=http%3A%2F%2Fcodenvy-dev" +
//                ".com%2Fgit%2F8c%2Faf%2F79%2Fworkspaceprc1iwncrr4eltxc%2FfactoryUrlRepo&idcommit
// =606e4c672a18c20c68e4f865e8da4f68ac7a4a44" +
//                "&action=openproject&ptype=Spring";


        //git/refs/heads/master


    }
}

