import java.util.Scanner;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.*;
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Integer i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        for(Integer i = 100;i >= -10;i-=5){
//            System.out.println(i);
//        }
//
//        for(long x = 2L;x <= 1000000L;x*=x){
//            System.out.println(x);
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (((i % 3) == 0) && ((i % 5) == 0))
//                System.out.println("fizzbuzz");
//            else if ((i % 3) == 0)
//                System.out.println("fizz");
//            else if ((i % 5) == 0)
//                System.out.println("buzz");
//            else
//                System.out.println(i);
//        }
        System.out.println("Enter an integer: ");
        int userNum = scanner.nextInt();

//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Stack<Integer> stack = new Stack<>();
//        for(int i = 0; i<=userNum; i++ ){
//            stack.push(i);
//        }
//        Object columnNames[] = {"Number", "Squared", "Cubed"};
//        JTable table = new JTable(stack, columnNames);
//        JScrollPane scrollPane = new JScrollPane(table);
//        frame.add(scrollPane, BorderLayout.CENTER);
//        frame.setSize(300, 150);
//        frame.setVisible(true);
//        System.out.println(table);
        System.out.print("Enter an integer you want to go up to: ");
        int num = scanner.nextInt();
        System.out.println(num);
        int squared = num * num;
        int cubed = num * num * num;


        System.out.println("number  |  squared  | cubed");
        for(long i = 1; i <= num; i++){
            System.out.println("        |           |      ");
            System.out.println(i   +"       |      "+ i*i +"    |      " + i*i*i);
        }

        System.out.print("Enter a numerical grade from 0 to 100: ");
        int grade = scanner.nextInt();
        if (grade >= 88 && grade <= 100){
            System.out.println("A");
        } else if (grade >= 80 && grade <= 87){
            System.out.println("B");
        } else if (grade >= 67 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 66) {
            System.out.println("D");
        } else if (grade <= 59){
            System.out.println("F");
        } else {
            System.out.println("That isn't a possible grade.");
        }

    }

}

