package ua.max.pochercushki.github;

import java.io.IOException;

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
}


public class Github {

    public static void main(String[] args) {

    }


}
