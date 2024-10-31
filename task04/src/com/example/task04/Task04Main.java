package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double result = 0;

        while (scanner.hasNextDouble()) {
            double token = scanner.nextDouble();
            result += token;
        }

        System.out.printf(Locale.US,"%.6f", result);
    }
}
