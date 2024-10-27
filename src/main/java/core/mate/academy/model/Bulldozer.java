package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String buldozerField;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getBuldozerField() {
        return buldozerField;
    }

    public void setBuldozerField(String buldozerField) {
        this.buldozerField = buldozerField;
    }
}
