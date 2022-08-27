package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

/**
 * Подключение к сайту.
 */
public final class HttpService {
  /**
   * Шаблон адреса для получения данных пользователя на сервисе Reqres.
   */
  public static final String BASE_URL = "https://reqres.in/";
  public static final String USER_URI = "api/users/";
  public static String url = BASE_URL + USER_URI;

  /**
   * Свойство объекта с данными пользователя, содержащее имя пользователя.
  */
  public static final String FIRST_NAME = "first_name";

  /**
   * Свойство объекта с данными пользователя, содержащее фамилию пользователя.
   */
  public static final String LAST_NAME = "last_name";

  /**
   * Получение пользователя по идентификатору.
   *
   * @param id Идентификатор пользователя.
   * @return Данные пользователя или ошибку.
   */
  public static String getUserWithUrlConnection(int id) throws IOException {
    var url = new URL(HttpService.url + id);
    var connection = (HttpURLConnection) url.openConnection();
    return new BufferedReader(new InputStreamReader(connection.getInputStream()))
        .lines()
        .collect(Collectors.joining());
  }
}
