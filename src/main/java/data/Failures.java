package data;

public enum Failures {
    NOT_FOUND("User not found!"),
    OTHER_FAILURES("Other failures."),
    INVALID_ARGUMENT("Invalid argument.");

    private final String title;

    Failures(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
