package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);
//    String input = sc.next();

    public String getString() {
        return sc.next();
    }

    public boolean yesNo() {
        System.out.println("Enter the word yes.");
        String input = getString();
        if (input.equalsIgnoreCase("y") || (input.equalsIgnoreCase("yes"))) {
            return true;
        } else {
            return false;
        }
    }


    public int getInt(int min, int max) {
        int num;
        do {
            System.out.println("Enter a number.");
            num = sc.nextInt();
        } while (num < min || num > max);
        return num;
    }

    public double getDouble(double min, double max) {
        Double dub;
        do {
            System.out.println("Enter a number.");
            dub = sc.nextDouble();
        } while (dub < min || dub > max);
        return dub;
    }

    public double getDouble() {
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        Input input = new Input();
        input.yesNo();
        input.getInt(1, 10);
    }
}
