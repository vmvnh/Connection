import data.Failures;
import data.User;
import services.ConsoleService;
import services.HttpService;
import services.JsonService;

/**
 * Запуск приложения.
 */
public final class Connection {
  /**
   * Запуск приложения.
   *
   * @param args Аргументы переданные при запуске.
   */
  public static void main(String[] args) {
    try {
      var userId = ConsoleService.getUserId(args);
      String userData;
      if (userId > 0) {
        userData = HttpService.getUserWithUrlConnection(userId);
        User user = JsonService.parseWithString(userData);
        System.out.println(user);
      } else {
        System.err.println(Failures.NOT_FOUND);
      }
    } catch (Exception e) {
      System.err.println(Failures.NOT_FOUND);
    }
  }
}
