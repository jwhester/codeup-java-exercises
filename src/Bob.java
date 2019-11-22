import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Talk to Bob.");
        String input = scanner.nextLine();
        do {
        if (input.endsWith("?")){
            System.out.println("Sure. ¯\\_(ツ)_/¯");
        }else if (input.endsWith("!")){
            System.out.println("Whoa, chill out! ┌∩┐(ಠ_ಠ)┌∩┐ ");
        }else if (input.trim().equals("")){
            System.out.println("Fine. Be that way! (ಠ益ಠ)" );
        } else {
            System.out.println("Whatever. ヾ( ･`⌓´･)ﾉﾞ");
        }
        input = scanner.nextLine();
    } while (!input.equalsIgnoreCase("bye"));

    }
}
