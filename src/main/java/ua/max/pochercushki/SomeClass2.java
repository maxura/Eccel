package ua.max.pochercushki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 8/15/13 2:07 PM
 */
public class SomeClass2 {

    private Pattern pattern;
    private Matcher mtch;
    private String regexpPattern = "(?<=name : ).*\\n";
    static  String str           = "[INFO] Application \n" +
                                   "[gitUrl : git@heroku.com:enigmatic-chamber-6273.git\n" +
                                   "webUrl : http://enigmatic-chamber-6273.herokuapp.com/\n" +
                                   "name : enigmatic-chamber-6273\n" +
                                   "] is successfully created.";


    public static void main(String[] args) {

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<:");
        //System.out.println(str.replace("http://", "").replace(".herokuapp.com/", ""));

    }

    public String catLinks(String str) {
        pattern = Pattern.compile(regexpPattern);
        mtch = pattern.matcher(str);
        String retStr = null;
        while (mtch.find()) {
            retStr = mtch.group();
        }
        return retStr;
    }




    //public static void main(String[] args) {
    //   System.out.println(str.replace("http://", "").replace(".herokuapp.com/", ""));

//}


}

