package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Task4();
    }
    static void Task1() {
        /*Вычислить n-ое треугольного число(сумма чисел от 1 до n)
         */
        System.out.print("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.print("Сумма чисел от 1 до n: " + sum);
    }
    static void Task2() {
        /*Вычислить n! (произведение чисел от 1 до n)
         */
        System.out.print("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        System.out.print("Факториал числа n: " + res);

    }
    static void Task3() {
        /*
        Вывести все простые числа от 1 до 1000 (простые числа - это числа,
        которые делятся только на себя и на единицу без остатка. Чтобы найти
        остаток от деления используйте оператор % , например 10%3 будет равно единице)
         */
        for (int i = 2; i <= 1000; i++) { // число 1 не простое по определению, поэтому с 2ки начинаем

            for (int j = 2; j <= i; j++) {

                if (j < i  & i % j == 0) {
                    break;
                }
                if (i % j == 0) {
                    System.out.print(i + ", ");
                }
            }
        }
    }
    static void Task4() {
        /*Реализовать простой калькулятор ("введите первое число"... "Введите второе число"...
        "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        double res = 0;
        switch(op) {
            case '+': res = num1 + num2;
                break;
            case '-': res = num1 - num2;
                break;
            case '*': res = num1 * num2;
                break;
            case '/': res = num1 / num2;
                break;
            default:  System.out.print("Некорректный ввод");
                return;
        }
        System.out.print("Результат операции:");
        System.out.print(num1 + " " + op + " " + num2 + " = " + res);
    }
}
