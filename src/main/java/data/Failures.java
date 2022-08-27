package data;

/**
 * Ошибки.
 */
public enum Failures {
  NOT_FOUND("User not found!");

  private final String title;

  Failures(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
