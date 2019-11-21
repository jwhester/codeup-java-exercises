import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pie is approximately, %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();

        System.out.println("Enter 3 words:");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        System.out.printf("%s %s %s %n",string1, string2, string3);

        scanner.nextLine();

        System.out.println("Enter a sentence:");
        String sentence1 = scanner.nextLine();
        System.out.println(sentence1);

        System.out.println("Enter length and width of the class room:");
        float length = Float.parseFloat(scanner.next());
        float width = Float.parseFloat(scanner.next());
        float area = length * width;
        float perimeter = (length*2)+(width*2);
        System.out.printf("The area of the class room is %f and the perimeter is %f %n ",area, perimeter);



    }
}
