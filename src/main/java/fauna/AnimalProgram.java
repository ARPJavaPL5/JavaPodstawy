package fauna;

import java.util.Scanner;

public class AnimalProgram {
    public static void main(String[] args) {
        Lion lion = new Lion(4, 4);
        System.out.println(lion);

        System.out.println("Cześć, jestem lew. Co chcesz żebym zrobił?");

        Scanner scanner = new Scanner(System.in);
        String option = "";

        while (!option.equals("Q")) {

            System.out.println(lion);
            option = readOption();

            switch (option) {
                case "N":
                    try {
                        lion.makeNoise();
                    } catch (AnimalHungerException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "S":
                    try {
                        lion.sleep();
                    } catch (AnimalHungerException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "E":
                    try {
                        lion.eat();
                    } catch (AnimalHungerException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "T":
                    System.out.println("Podaj współrzędną X:");
                    double x = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Podaj współrzędną Y:");
                    double y = scanner.nextDouble();
                    scanner.nextLine();
                    try {
                        lion.travel(x, y);
                    } catch (AnimalTravelException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "Q":
                    System.out.println("KONIEC");
                    break;
                default:
                    System.out.println("Nie rozumiem o co Ci chodzi");
            }
        }

//        lion.makeNoise();
//
//        lion.sleep();
//        lion.makeNoise();
//
//        lion.eat();
//        lion.eat();
//        lion.eat();
//        lion.eat();
//
//        lion.travel(5, 1);
//        lion.travel(1, -7);
//        lion.travel(3.9, -2.7);
//        lion.travel(2.2, 1.1);
    }

    private static String readOption() {
        System.out.println("N - zrób hałas");
        System.out.println("S - idź spać");
        System.out.println("E - jedz");
        System.out.println("T - wędruj");
        System.out.println("Q - koniec");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
