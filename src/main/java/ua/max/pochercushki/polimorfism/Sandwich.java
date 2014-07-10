/*
 *
 * CODENVY CONFIDENTIAL
 * ________________
 *
 * [2012] - [2014] Codenvy, S.A.
 * All Rights Reserved.
 * NOTICE: All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any. The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package ua.max.pochercushki.polimorfism;

import ua.max.pochercushki.print.Print;

/** @author Musienko Maxim */
class Meal {
    Meal() {
        Print.print("Meal()");
    }
}


class Bread {
    Bread() {
        Print.print("Bread()");
    }
}


class Cheese {
    Cheese() {
        Print.print("Cheese()");
    }
}


class Lettuce {
    Lettuce() {
        Print.print("Lettuce()");
    }
}

class Launch extends Meal {
    Launch() {
        Print.print("Launch()");
    }
}

class PortableLaunch extends Launch {
    PortableLaunch() {
        Print.print("PortableLaunch()");
    }
}

public class Sandwich extends PortableLaunch {

    private Bread   b = new Bread();
    private Cheese  c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        Print.print("Sandwich");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
