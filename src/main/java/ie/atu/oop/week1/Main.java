package ie.atu.oop.week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static  Scanner input = new Scanner(System.in);

    public static Member createMember(){
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

        boolean run = true;
        int option;

        while (run) {
            System.out.println("\n-----Gym Membership Management-----\n1. Add Member\t2. Display All Members\t3. Search by ID\n4. Remove Member\t5. Exit");
            System.out.print("Enter Choice: ");

            option = input.nextInt();
            input.nextLine();

            System.out.println();

            switch (option) {
                case 1:
                    try {
                        manager.addMember(createMember());
                        System.out.println("[+] Member added successfully.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("[-] Error adding member: " + e.getMessage());
                    }
                    break;

                case 2:
                    manager.displayMembers();
                    break;

                case 3:
                    System.out.println("Enter member ID: ");
                    manager.getMemberByID(input.next(), true);
                    break;

                case 4:
                    System.out.println("Enter member ID: ");
                    if (manager.removeMemberByID(input.next())) System.out.println("[+] Member removed successfully.");;
                    break;

                case 5:
                    run = false;
                    break;

                default:
                    System.out.println("[-] Invalid option");
                    break;
            }
        }
    }
}