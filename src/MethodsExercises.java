import java.util.Scanner;
import java.util.Random;


public class MethodsExercises {
    Scanner scanner = new Scanner(System.in);
    public static void add(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void subtract(int num1, int num2){
        System.out.println(num1 - num2);
    }
    public static void multiply(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public static void divide(int num1, int num2){
        System.out.println(num1 / num2);
    }
    public static void mod(int num1, int num2){
        System.out.println(num1 % num2);
    }
    int userInput = getInteger(1, 10);
    private static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ",min, max);
        int input = scanner.nextInt();
        while (input < min || input > max) {
            System.out.printf("That's not right, try again. %nEnter a number between %s and %s: ", min, max);
            input = scanner.nextInt();
        }
        System.out.println("That's correct!\nEnding program.");
        return input;

    }
    private static void factorial(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ",min, max);
        int number = getInteger(min,max);
        int total = 1;
        System.out.printf("%s! = ",number);
        for (int i = 1; i <= number; i++){
            if (i == number){
                System.out.printf("%s",i);
            }else {
                System.out.printf("%s x ",i);
            }
            total *= i;
        }
        System.out.printf(" = %s %n",total);
        System.out.println("Continue? (Yes/No)");
        String continueInput = sc.next();
        if (continueInput.equalsIgnoreCase("yes")){
            factorial(min, max);
        }else {
            System.out.println("Ending function.");
        }

    }
    private static void diceRoll(int sidesNum){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean loop = true;
        while (loop){
        System.out.print("Roll? (yes/no): ");
        String rollInput = sc.next();
        if (rollInput.equalsIgnoreCase("yes")){
            System.out.println();
            System.out.print("Dice Rolls: ");
            for (int i =1;i<=2;i++){
                System.out.printf("%s ", (random.nextInt(sidesNum -1)+1));
            }
            System.out.println();
            System.out.println();
            diceRoll(sidesNum);
        }else if (rollInput.equalsIgnoreCase("no")){
                loop = false;
        } else {
            System.out.println("Error: please enter yes or no...");
            diceRoll(sidesNum);
        }
        }
    }



    public static void main(String[] args) {
//        add(2,3);
//        subtract(5,2);
//        multiply(3,8);
//        divide(9,3);
//        mod(6,4);
        getInteger(1, 10);
        diceRoll(4);
        factorial(4, 20);
    }
}





