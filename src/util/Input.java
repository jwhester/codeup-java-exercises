package util;

import java.util.Scanner;

public class Input extends Exception {
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
        System.out.println("Enter a number.");
        int num = Integer.valueOf(getString());
                try {
                    if (num < min || num > max)
                        return getInt(min, max);
                } catch (Exception e){
                    System.out.println("Enter a number");
                    getInt(min, max);
                }
        System.out.println("You're number is " + num);
                return num;
    }

    public int getInt(){
        System.out.println("Enter a number.");
        return Integer.parseInt(getString());

    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number.");
        double num = Double.valueOf(getString());
        try {
            if (num < min || num > max)
                return getDouble(min, max);
        } catch (Exception e){
            System.out.println("Enter a number");
            getDouble(min, max);
        }
        System.out.println("You're number is " + num);
        return num;
    }

    public double getDouble() {
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        Input input = new Input();
        input.yesNo();
        input.getInt(1, 10);
        input.getDouble(1,10);
    }
}
