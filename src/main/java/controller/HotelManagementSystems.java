package controller;

import config.HibernateUtils;

import java.util.Scanner;

public class HotelManagementSystems {

    private static Scanner scanner=new Scanner(System.in);

    public static void displayMenuHotelManagementSystem(){

        boolean exit=false;

        while (!exit){
            System.out.println("====== Hotel Management System Menu ======");
            System.out.println("1. Hotel Operations");
            System.out.println("2. Room Operations");
            System.out.println("3. Guest Operations");
            System.out.println("4. Reservation Operations");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            int choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    displayHotelOperationsMenu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    exit=true;
                    System.out.println("Good bye...");
                    HibernateUtils.shutDown();
                    break;
                default:
                    System.out.println("Invalid choice, Please try again");
                    break;
            }

        }
    }

    private static void displayHotelOperationsMenu() {
        System.out.println("HotelOperationMenu");

    }




}
