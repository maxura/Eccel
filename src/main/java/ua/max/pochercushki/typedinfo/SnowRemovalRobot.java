package ua.max.pochercushki.typedinfo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mmusienko on 11/25/14.
 */
public class SnowRemovalRobot implements Robot {
    private String name;

    public SnowRemovalRobot(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    @Override
    public String model() {
        return "SnowBot Series 11";
    }

    @Override
    public List<Operation> operations() {
        return Arrays.asList(new Operation() {
                                 public String description() {
                                     return name + " can remove snow";
                                 }

                                 public void command() {
                                     System.out.println(name + " removes snow");
                                 }
                             }, new Operation() {
                                 @Override
                                 public String description() {
                                     return name + " can break ice";
                                 }

                                 @Override
                                 public void command() {
                                     System.out.println("breaks ice");
                                 }
                             },
                new Operation() {
                    @Override
                    public String description() {
                        return name + " can clean roof";
                    }

                    @Override
                    public void command() {
                        System.out.println(name + " cleans roof");
                    }
                });
    }

    public static void main(String[] args) {
        Robot.Test.test(new SnowRemovalRobot("Slusher"));
    }
}
