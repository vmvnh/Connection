package services;

import data.Failures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public final class HttpService {
    /**
     * Шаблон адреса для получения данных пользователя на сервисе Reqres.
     */
    public static final String BASE_URL = "https://reqres.in/";
    public static final String USER_URI = "api/users/";
    public static String url = BASE_URL + USER_URI;

    /**
     * Получение пользователя по идентификатору.
     *
     * @param id Идентификатор пользователя.
     * @return Данные пользователя или ошибку.
     */
    public static String getUserWithUrlConnection(int id) throws IOException {
        var url = new URL(HttpService.url + id);
        var connection = (HttpURLConnection) url.openConnection();
        var responseCode = connection.getResponseCode();
        switch (responseCode) {
            case 404 -> {
                System.err.println(Failures.NOT_FOUND);
                return null;
            }
            case 200 -> {
                return new BufferedReader(new InputStreamReader(connection.getInputStream()))
                        .lines()
                        .collect(Collectors.joining());
            }
            default -> {
                System.err.println(Failures.OTHER_FAILURES);
                return null;
            }
        }
    }
}
