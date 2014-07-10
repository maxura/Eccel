package ua.max.pochercushki.netexamps;

import sun.net.www.protocol.http.HttpURLConnection;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 10/21/13 11:39 AM
 */
public class NetSample {
    public static void main(String[] args) throws Exception {

        URL hp = new URL("http://google.com");
        HttpURLConnection hpcon = (HttpURLConnection)hp.openConnection();
        System.out.println("The method of request:" + hpcon.getRequestMethod());
        System.out.println("The code of responce:" + hpcon.getResponseCode());
        System.out.println("The content of responce:" + hpcon.getResponseMessage());

        Map <String, List<String>> hdrMap = hpcon.getHeaderFields();
        Set<String>hdrFields = hdrMap.keySet();
        System.out.println(hdrMap);

    }
}
