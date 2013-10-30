package ua.max.pochercushki.getnames;


import java.io.IOException;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 10/30/13 11:13 AM
 */
public class CloudIdeLogin {
    /** login for test servers, production server and staging */

    private String dev          = "https://codenvy-dev.com";
    private String staging      = "https://codenvy-dev.com";
    private String production   = "https://codenvy.com";
    private String userName     = "musienko.maxim@gmail.com";
    private String userPassword = "vfrcbv_1978";

    static {
        CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
    }

    private void getLoginPage() {
        StringBuilder build = new StringBuilder();
        HttpURLConnection connect = null;
        try {
            String lOGIN_URL = "https://codenvy-dev.com/site/sso/server/gen?&authType=jaas";
            System.err.println(lOGIN_URL);
            connect = (HttpURLConnection)new URL(lOGIN_URL).openConnection();
            connect.setRequestMethod("POST");
            connect.setAllowUserInteraction(false);
            connect.setInstanceFollowRedirects(true);
            connect.setDoInput(true);
            connect.setDoOutput(true);
            OutputStream outStream = connect.getOutputStream();
            outStream.write(("email=" + userName + "&password=" + userPassword).getBytes());

            connect.getOutputStream().close();
            while (connect.getInputStream().available() != 0) {
                build.append(((char)connect.getInputStream().read()));
            }
            System.out.println(build.toString());

            connect.getInputStream().close();
            connect.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connect != null) {
                connect.disconnect();
            }
        }

    }

    private void getUserData() {
        String restUrl = "https://codenvy-dev.com/site/rest/private/organization/users";
        StringBuilder build = new StringBuilder();
        HttpURLConnection http = null;
        try {
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
        CloudIdeLogin inst = new CloudIdeLogin();
        inst.getLoginPage();
        inst.getUserData();

    }
}


//Map<String, List<String>> headerFields = http.getHeaderFields();
//            System.out.println(headerFields.toString());
//            Set<String> keySet = headerFields.keySet();
//
//            for (String key : keySet) {
//                List<String> vals = headerFields.get(key);
//                for (String string : vals) {
//                    System.out.println("               " + key + " :: " + string);
//                }
//            }
//            System.err.println("     >>>>>>         " + http.getResponseCode());
//            System.err.println("-----------------------------------------------------");