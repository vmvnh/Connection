package data;

public final class User {
    /**
     * Имя пользователя.
     */
    public String firstName;

    /**
     * Фамилия пользователя.
     */
    public String lastName;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public User() {}

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
