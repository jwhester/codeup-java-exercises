import java.util.Random;

public class Practice {
    public static void convert(int minutes) {
        System.out.println(minutes * 60);
    }
    public static void ConvertHoursToSeconds(int hours){
        System.out.println((hours * 60) * 60);
    }

    public static boolean lessThan100(int a, int b) {
        if (a + b <= 100){
            return true;
        } else {
            return false;
        }
    }

    public static void isEqual(int num1, int num2) {
        if (num1 == num2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void SumOfTwoNumbers(int a, int b) {
        if (a + b <= 100){
            System.out.println((a + b) + " is less than 100!");
        } else {
            System.out.println((a + b) + " is more than 100!");
        }



    }
    public static void animals(int chickens, int cows, int pigs) {
        int chicken = chickens * 2;
        int cow = cows * 4;
        int pig = pigs * 4;
        System.out.println(chicken + cow + pig);
    }

    public static void triArea(int base, int height) {
        System.out.println((base * height)/2);
    }

    public static void hello(String name ){
        if(name.contains("a") | name.contains("A")){
            System.out.println("Your name has an A");
        } else{
            System.out.println("Your name does not have an A in it.");
        }
    }

    public static int Fibonacci(int a)
    {
        if (a == 0){
            return 1;
        }
        if (a <= 2)
            return a;
        return Fibonacci(a-1) + Fibonacci(a-2);

    }


    public static void sayHelloBye(String name, int num) {
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        if (num == 1){
            System.out.println("Hello " + name);
        } else{
            System.out.println("Bye " + name);
        }
    }

    public static void check(int a, int b, int c){
        if (a > b && a > c){
            System.out.println(a + " wins!");
        }
        if (a > b && a < c){
            System.out.println(a + " beats " + b);
        }
        if (a < b && a < c){
            System.out.println(a + " loses.");
        }

        if (a < b && a > c){
            System.out.println(a + " beats " + c);
        } else {
            System.out.println(a +" "+ b+" " + c);
        }
    }
    public static void main(String[] args) {
        SumOfTwoNumbers(1,2);
        convert(100);
        isEqual(1, 1);
        ConvertHoursToSeconds(1);
        System.out.println(Fibonacci(25));
        hello("Albuquerque");

    }
}
