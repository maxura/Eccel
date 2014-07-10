package ua.max.pochercushki.herokutest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 10/31/13 4:23 PM
 */
public class Services {
    private String herokuKeyListApiUrl = "";


    void getHerokuKeys() throws IOException {
        StringBuilder jsonString = new StringBuilder();
        URL url = new URL("https://api.heroku.com/account/keys");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/vnd.heroku+json; version=3");
        String userpass = "maxura@ukr.net:vfrcbv_1978";
        String basicAuth = "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(userpass.getBytes());
        connection.setRequestProperty("Authorization", basicAuth);

        while (connection.getInputStream().available() != 0) {
            jsonString.append((char)connection.getInputStream().read());
        }
        System.out.println(jsonString.toString());
        connection.getInputStream().close();
        connection.disconnect();
    }


    void removeAllKeys() throws IOException {
        URL url = new URL("https://api.heroku.com/user/keys");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("Accept", "application/json");
        String userpass = "maxura@ukr.net:vfrcbv_1978";
        String basicAuth = "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(userpass.getBytes());
        connection.setRequestProperty("Authorization", basicAuth);
        System.out.println(connection.getResponseCode());
        connection.disconnect();
    }


    public static void main(String[] args) throws IOException {
        Services srv = new Services();
        srv.getHerokuKeys();
    }





}
