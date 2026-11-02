package ie.atu.oop.week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Member createMember(){
        Scanner input = new Scanner(System.in);

        String name, id;
        int age;

        System.out.println("Enter member ID: ");
        id = input.next();
        input.nextLine();

        System.out.println("Enter name: ");
        name = input.nextLine();

        System.out.println("Enter age: ");
        age = input.nextInt();
        input.nextLine();

        return new Member(id, name, age);
    }

    public static void main(String[] args) {
        MembershipManager manager = new MembershipManager();
        Scanner input = new Scanner(System.in);

        boolean run = true;
        int option;

        while (run) {
            System.out.println("\n1. Add Member\t2. Display All Members\t3. Search by ID\n4. Remove Member\t5. Exit");
            System.out.printf("Enter Choice: ");
            option = input.nextInt();
            input.nextLine();
            System.out.println();

            switch (option) {
                case 1:
                    manager.addMember(createMember());
                    break;
                case 2:
                    manager.displayMembers();
                    break;
                case 3:
                    System.out.println("Enter member ID: ");
                    manager.getMemberByID(input.next(), true);
                    break;
                case 4:
                    break;
                case 5:
                    run = false;
            }
        }
    }
}