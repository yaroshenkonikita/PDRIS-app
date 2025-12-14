# PDRIS App

Учебное приложение для Jenkins pipeline (сборка, unit-тесты + Allure, статический анализ, публикация артефакта в Nexus).

## Требования

- JDK 17+
- Maven 3.8+

## Сборка и тесты локально

```bash
mvn -B clean test
```

Allure results будут в `target/allure-results`.

## Сборка артефакта

```bash
mvn -B clean package
ls -la target/pdris-app.jar
```

