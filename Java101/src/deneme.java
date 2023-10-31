import java.util.Scanner;

public class deneme {
    private static boolean[] seats = new boolean[11]; // Seats 1-10, with index 0 unused

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    assignFirstClass();
                    break;
                case 2:
                    assignEconomy();
                    break;
                case 3:
                    validateTicketBySeatId(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please type 1, 2, or 3.");
            }

            if (isPlaneFull()) {
                System.out.println("The plane is now full.");
                break;
            }
        }
    }

    public static void displayMenu() {
        System.out.println("Please type 1 for Buying First Class Ticket");
        System.out.println("Please type 2 for Buying Economy Class Ticket");
        System.out.println("Please type 3 for Ticket Validation");
    }

    public static void assignFirstClass() {
        for (int seat = 1; seat <= 5; seat++) {
            if (!seats[seat]) {
                seats[seat] = true;
                System.out.println("Seat " + seat + " in the First Class section is assigned.");
                break;
            } else if (seat == 5) {
                System.out.println("First Class is full. Would you like an Economy Class seat instead? (Y/N)");
                Scanner scanner = new Scanner(System.in);
                char choice = scanner.next().charAt(0);
                if (Character.toLowerCase(choice) == 'y') {
                    assignEconomy();
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            }
        }
    }

    public static void assignEconomy() {
        for (int seat = 6; seat <= 10; seat++) {
            if (!seats[seat]) {
                seats[seat] = true;
                System.out.println("Seat " + seat + " in the Economy Class section is assigned.");
                break;
            } else if (seat == 10) {
                System.out.println("Economy Class is full. Would you like a First Class seat instead? (Y/N)");
                Scanner scanner = new Scanner(System.in);
                char choice = scanner.next().charAt(0);
                if (Character.toLowerCase(choice) == 'y') {
                    assignFirstClass();
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            }
        }
    }

    public static void validateTicketBySeatId(Scanner scanner) {
        System.out.println("Please enter the seat number to validate: ");
        int seatID = scanner.nextInt();

        if (seatID >= 1 && seatID <= 10) {
            if (seats[seatID]) {
                System.out.println("Seat " + seatID + " is already sold.");
            } else {
                System.out.println("Seat " + seatID + " is available.");
            }
        } else {
            System.out.println("Invalid seat number. Seat numbers range from 1 to 10.");
        }
    }

    public static boolean isPlaneFull() {
        for (boolean seat : seats) {
            if (!seat) {
                return false;
            }
        }
        return true;
    }
}