package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozerField;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getBulldozerField() {
        return bulldozerField;
    }

    public void setBulldozerField(String buldozerField) {
        this.bulldozerField = buldozerField;
    }
}
