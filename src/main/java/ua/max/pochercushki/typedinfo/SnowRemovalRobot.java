package ua.max.pochercushki.typedinfo;

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
        return null;
    }

    @Override
    public List<Operation> operations() {
        return null;
    }

}
