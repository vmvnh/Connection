# REST-приложение получение пользователя.

## Задание

Разработать консольное приложение, работающее с сервисом [Reqres](https://reqres.in).

Приложение должно получать идентификатор пользователя (целое число) через аргументы командной строки и отображать
в консоли его имя и фамилию. Приложение должно отображать в консоли сообщение об ошибке, если пользователь
не был найден. После вывода сообщения приложение должно завершать свою работу.

Пример работы приложения, когда пользователь был найден:

```
java <имя приложения> 1
George Bluth
```

Пример работы приложения, когда пользователь не был найден:

```
java <имя приложения> 42
User not found!
```

### Требования к решению

1. Код приложения должен храниться в репозитории GitHub.
2. Коммиты в репозитории должны быть атомарными. Сообщения к коммитам должны соответствовать
   [соглашению](https://www.conventionalcommits.org/ru/v1.0.0/).
3. Код на Java должен быть логически структурированным.
4. Код на Java должен быть аккуратным и оформленным в соответствии с
   [соглашением](https://google.github.io/styleguide/javaguide.html).
5. Для всех классов и их членов должны быть написаны документирующие комментарии
   [javadoc](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html).

## Особенности реализации


