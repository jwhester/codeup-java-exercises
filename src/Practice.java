import java.util.Random;

public class Practice {
    public static void convert(int minutes) {
        System.out.println(minutes * 60);
    }

    public static void isEqual(int num1, int num2) {
        if (num1 == num2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void SumOfTwoNumbers(int a, int b) {
        System.out.println(a + b);


    }


    public static void main(String[] args) {
        SumOfTwoNumbers(1,2);
        convert(100);
        isEqual(1, 1);

    }
}
