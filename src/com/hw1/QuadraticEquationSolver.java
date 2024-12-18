package com.hw1;

import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        // Создание объекта Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        double a = 0, b = 0, c = 0;

        // Ввод коэффициентов a, b и c с обработкой исключений
        try {
            System.out.print("Введите коэффициент a: ");
            a = scanner.nextDouble();

            System.out.print("Введите коэффициент b: ");
            b = scanner.nextDouble();

            System.out.print("Введите коэффициент c: ");
            c = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите числовые значения.");
            scanner.close();
            return;
        }

        // Проверка, что a не равно 0 (иначе это не квадратное уравнение)
        if (a == 0) {
            System.out.println("Это не квадратное уравнение!");
            scanner.close();
            return;
        }

        // Вычисление дискриминанта
        double discriminant = b * b - 4 * a * c;

        // Проверка значения дискриминанта
        if (discriminant > 0) {
            // Два различных корня
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Уравнение имеет два корня:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            // Один корень
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень:");
            System.out.println("x = " + x);
        } else {
            // Нет корней (дискриминант отрицателен)
            System.out.println("Уравнение не имеет действительных корней.");
        }

        // Закрытие Scanner
        scanner.close();
    }
}
