package ru.vsu.cs;

import java.util.Scanner;

public class Main
{
    public static int calcSeconds(int h1, int h2, int m1, int m2, int s1, int s2)
    {
        return ((h2+24-h1)*3600 + (m2-m1)*60 + (s2-s1)) % 86400;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый момент времени: ");
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();

        System.out.print("Введите второй момент времени: ");
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        System.out.print("Секунд с момента времени 1 до момента времени 2: " + calcSeconds(h1, h2, m1, m2, s1, s2));
    }

}
