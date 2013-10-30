package ua.max.pochercushki.getnames;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 10/29/13 1:27 PM
 */
public class CloudIDEGetName {

    private String dev          = "https://codenvy-dev.com";
    private String staging      = "https://codenvy-dev.com";
    private String production   = "https://codenvy.com";
    private String userName     = "musienko.maxim@gmail.com";
    private String userPassword = "vfrcbv_1978";


    /** login for test servers, production server and staging */
    private void login() {
        HttpURLConnection http = null;
        try {
            String lOGIN_URL =
                    dev + "/site/sso/server/gen?authType=jaas";
            System.err.println(lOGIN_URL);
            http = (HttpURLConnection)new URL(lOGIN_URL).openConnection();
            http.setRequestMethod("POST");
            http.setAllowUserInteraction(false);
            http.setInstanceFollowRedirects(true);
            http.setDoOutput(true);
            OutputStream output = http.getOutputStream();
            output.write(("email=" + userName + "&password=" + userPassword).getBytes());
            output.close();

            Map<String, List<String>> headerFields = http.getHeaderFields();
            System.out.println(headerFields.toString());
            Set<String> keySet = headerFields.keySet();

            for (String key : keySet) {
                List<String> vals = headerFields.get(key);
                for (String string : vals) {
                    System.out.println("               " + key + " :: " + string);
                }
            }
            System.err.println("     >>>>>>         " + http.getResponseCode());
            System.err.println("-----------------------------------------------------");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (http != null) {
                http.disconnect();
            }
        }

    }


    public void tryGetNames() {

        String restUrl = "https://codenvy-dev.com/site/rest/private/organization/users";
        StringBuilder build = new StringBuilder();
        HttpURLConnection http = null;
        try {
            login();
            http = (HttpURLConnection)new URL(restUrl).openConnection();
            http.setRequestProperty("Referer", restUrl);
            http.setAllowUserInteraction(false);

            http.setRequestMethod("GET");

            while (http.getInputStream().available() != 0) {
                build.append(((char)http.getInputStream().read()));
            }

            System.out.println("*********:" + build.toString());
            http.getInputStream().close();
            http.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

    public static void main(String[] args) {
        CloudIDEGetName instClass = new CloudIDEGetName();
        instClass.tryGetNames();
    }


}
