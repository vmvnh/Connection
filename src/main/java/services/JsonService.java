package services;

import static services.HttpService.FIRST_NAME;
import static services.HttpService.LAST_NAME;

import data.User;
import java.util.Arrays;
import java.util.function.Function;

/**
 * Парсинг Json.
 */
public class JsonService {
  /**
   * Обрабатывает JSON методами класса.
   *
   * @param json Данные о пользователе.
   */
  public static User parseWithString(String json) {
    Function<String, String> getJsonProperty = (String property) -> Arrays
        .stream(json.split(","))
        .filter(str -> str.contains(property))
        .toList()
        .get(0)
        .split(":")[1]
        .replaceAll("\"", "");

    var firstName = getJsonProperty.apply(FIRST_NAME);
    var lastName = getJsonProperty.apply(LAST_NAME);
    return new User(firstName, lastName);
  }
}
