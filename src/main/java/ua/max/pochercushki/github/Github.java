package ua.max.pochercushki.github;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 11/20/13 12:02 PM
 */
class Tst {
    public boolean logIn(String cont) throws IOException {
        String st = "[{\"id\":4597131,\"url\":\"https://api.github.com/authorizations/4597131\",\"app\":{\"name\":\"codenvy-dev\"," +
                    "\"url\":\"http://codenvy-dev.com/\",\"client_id\":\"8a97e07f26ab2c567705\"}," +
                    "\"token\":\"0d0b36910b5983aff73c324c77852634f8cb1122\",\"note\":null,\"note_url\":null," +
                    "\"created_at\":\"2013-11-21T14:13:37Z\",\"updated_at\":\"2013-11-21T14:13:38Z\",\"scopes\":[\"repo\",\"user\"]}]";
        return st.contains(cont);

    }


    public void getAllRefs() throws IOException {
        String userpass = "exoinvitemain" + ":" + "eXoUATest14";
        String gitBranchurl = "https://api.github.com/repos/exoinvitemain/testRepo/git/refs";
        BufferedReader br = null;
        URL url = new URL(gitBranchurl);
        String line = null;
        StringBuilder autorizedApps = new StringBuilder();
        HttpsURLConnection hpcon = (HttpsURLConnection)url.openConnection();
        hpcon.setRequestMethod("GET");
        String basicAuth = "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(userpass.getBytes());
        hpcon.setRequestProperty("Authorization", basicAuth);
        if (hpcon.getResponseCode() != 200) {
            throw new RuntimeException("Can not create connection with Github or service is unavailable");
        }

        br = new BufferedReader(new InputStreamReader(hpcon.getInputStream()));

        while ((line = br.readLine()) != null) {
            autorizedApps.append(line);
        }

        InputStream inputStream = hpcon.getInputStream();
        System.out.println("<<<<<<<<<<<<<<<<<<<<:" + hpcon.getResponseCode());
        System.out.println("********************:" + autorizedApps.toString());


        hpcon.disconnect();
    }


    public void deleteBranch(String name) throws IOException {
        String userpass = "exoinvitemain" + ":" + "eXoUATest14";
        String gitBranchurl = "https://api.github.com/repos/exoinvitemain/idefetchtest/git/refs/heads/" + name;
        URL url = new URL(gitBranchurl);
        HttpsURLConnection hpcon = (HttpsURLConnection)url.openConnection();
        String basicAuth = "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(userpass.getBytes());
        hpcon.setRequestProperty("Authorization", basicAuth);
        hpcon.setRequestMethod("DELETE");
        System.out.println(hpcon.getResponseCode());
        hpcon.disconnect();
    }


    public void addNewBranch(String newName) throws IOException {
        String userpass = "exoinvitemain" + ":" + "eXoUATest14";
        String gitBranchurl = "https://api.github.com/repos/exoinvitemain/idefetchtest/git/refs";
        URL url = new URL(gitBranchurl);
        HttpsURLConnection hpcon = (HttpsURLConnection)url.openConnection();
        String basicAuth = "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(userpass.getBytes());
        hpcon.setRequestProperty("Authorization", basicAuth);
        hpcon.setAllowUserInteraction(false);
        hpcon.setDoOutput(true);
        hpcon.setDoInput(true);
        hpcon.setRequestMethod("POST");
        OutputStream output = hpcon.getOutputStream();

        output.write(
                ("{" + "\"ref\": \"refs/heads/" + newName + "\"," + "\"sha\": \"a748b5b6e8c97d0c16077dbceea46529db040e5d\"" + "}")
                        .getBytes());
        System.out.println("<<<<<<<<<<<<<<<<<<<<:" + hpcon.getResponseCode());
        output.flush();
        output.close();
        hpcon.disconnect();
    }

//name=555&branch=master
}

public class Github {

    public static void main(String[] args) throws IOException {
        Tst st = new Tst();
        st.getAllRefs();
    }


}
