package academy.learnprogramming.accessmodifiers;

public class JavaEmployee {

    private final String firstName;
    private boolean fillTime;

    public JavaEmployee(String firstName) {
        this.firstName = firstName;
        this.fillTime = true;
    }

    public JavaEmployee(String firstName, boolean fillTime) {
        this.firstName = firstName;
        this.fillTime = fillTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isFillTime() {
        return fillTime;
    }

    public void setFillTime(boolean fillTime) {
        this.fillTime = fillTime;
    }
}
