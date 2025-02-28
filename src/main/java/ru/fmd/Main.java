package ru.fmd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя");
        name = scanner.nextLine();
        System.out.println("Введите возраст первого пользователя");
        age = scanner.nextInt();
        User user1 = new User(name, age);

        scanner.nextLine();

        System.out.println("Введите имя второго пользователя");
        name = scanner.nextLine();
        System.out.println("Введите возраст второго пользователя");
        age = scanner.nextInt();
        User user2 = new User(name, age);

        System.out.println( user1.getAge() < user2.getAge()? user1 : user2 );
    }
}