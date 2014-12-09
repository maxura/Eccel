package ua.max.pochercushki.typedinfo;

import java.util.List;

/**
 * Created by mmusienko on 11/25/14.
 */
public interface Robot {
    String name();

    String model();

    List<Operation> operations();

    class Test {
        public static void test(Robot r) {
            if (r instanceof Null)
                System.out.println("[Null Robot]");
            System.out.println("Name: " + r.name());
            System.out.println("Model: " + r.model());
            for (Operation operation : r.operations()) {
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
