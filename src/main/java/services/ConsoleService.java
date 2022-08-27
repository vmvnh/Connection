package services;

/**
 * Проверка и получение идентификатора пользователя.
 */
public class ConsoleService {
  /**
   * Проверка и получение идентификатора пользователя.
   *
   * @param args Аргументы командной строки.
   * @return Идентификатор пользователя.
   */
  public static int getUserId(String[] args) {
    if (args.length != 1) {
      throw new IllegalArgumentException();
    }
    return Integer.parseInt(args[0]);
  }
}
