package ie.atu.oop.week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, id;
        Integer age;

        System.out.println("Please enter your member ID: ");
        id = input.next();
        input.nextLine();

        System.out.println("Please enter your name: ");
        name = input.nextLine();

        System.out.println("Please enter your age: ");
        age = input.nextInt();
        input.nextLine();


        Member mem1 = new Member(id, name, age);
        mem1.displayDetails();
    }
}