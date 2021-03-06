package DontPanic;
import java.util.Scanner;
import java.util.Random;


public class DontPanic {
    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    String playerName;
    int age;
    int playerHP;
    String playerWeapon;
    int choice;
    int monsterHP;
    int theBook;

    public static void sleepy(int num) {
        try {
            Thread.sleep(num);
        } catch (Exception e) {
            System.out.println("yep");
        }
    }


    public static void main(String[] args) {

        DontPanic game;
        game = new DontPanic();

        game.playerSetUp();
        game.start();
    }

    public void playerSetUp(){


        playerHP = 10;
        monsterHP = 15;
        theBook = 0;

        playerWeapon = "Towel";

        System.out.println("Your HP: "+ playerHP);
        System.out.println("Your Weapon: "+ playerWeapon);

        System.out.println("Please enter your name:");

        playerName = myScanner.nextLine();

        System.out.println("How old are you?");

        age = myScanner.nextInt();
        if (age < 18){
            System.out.println("Sorry, but due to your age this adventure may not be suitable for you to attempt. Please return when you're at least the age of 18 years old.");
            System.out.println("Remember kids; School is cool, and drugs are bad!");
            System.exit(0);
        } else {
            System.out.println("Hello " + playerName + ", let's start the game!");

        }




    }
    public void start(){

        System.out.println("\n------------------------------------------------------------------\n");
        sleepy(2000);
        if (age >= 18 && age <= 29){
            System.out.println("At the tender young age of " + age + ", you find yourself hungry for adventure.");
            sleepy(2500);
            System.out.println("The best way for any young person to find that adventure is to find a job.");
            sleepy(2500);

        }else if(age >= 30){
            System.out.println("At the ripe old age of " + age + ", you find yourself hungry and broke.");
            sleepy(3500);
            System.out.println("The best way for any person to make money is to find a job.");
            sleepy(3500);
        }
        System.out.println("Luckily for you, you've just landed a big job interview at Megadodo Publications.");
        sleepy(3000);
        System.out.println("In fact that is where we start this adventure.");
        sleepy(3000);
        System.out.println("You're being interviewed for the job of field editor.");
        sleepy(3000);
        System.out.println("And you have no related experiences to this job what-so-ever.");
        sleepy(4000);
        System.out.println("Don't panic.");
        sleepy(4000);
        System.out.println("I'm sure you'll do just fine.");
        sleepy(3000);
        System.out.println("                        ;;\\\\/;;;;;;;;\n" +
                "                   ;;;;;;;;;;;;;;;;;\n" +
                "                ;;;;;;;;;;;;     ;;;;;\n" +
                "               ;;;;;    ;;;         \\;;\n" +
                "              ;;;;;      ;;          |;\n" +
                "             ;;;;         ;          |\n" +
                "             ;;;                     |\n" +
                "              ;;                     )\n" +
                "               \\    ~~~~ ~~~~~~~    /\n" +
                "                \\    ~~~~~~~  ~~   /\n" +
                "              |\\ \\                / /|\n" +
                "               \\\\| %%%%%    %%%%% |//\n" +
                "              [[====================]]\n" +
                "               | |  ^          ^  |\n" +
                "               | | :@: |/  \\| :@: | |\n" +
                "                \\______/\\  /\\______/\n" +
                "                 |     (@\\/@)     |\n" +
                "                /                  \\\n" +
                "               /  ;-----\\  ______;  \\\n" +
                "               \\         \\/         /\n" +
                "                )                  (\n" +
                "               /                    \\\n" +
                "               \\__                  /\n" +
                "                \\_                _/\n" +
                "                 \\______/\\/\\______/\n" +
                "                  _|    /--\\    |_\n" +
                "                 /%%\\  /\"'\"'\\  /%%\\\n" +
                "  ______________/%%%%\\/\\'\"'\"/\\/%%%%\\______________\n" +
                " / :  :  :  /  .\\%%%%%%%\\\"'/%%%%%%%/.  \\  :  :  : \\\n" +
                ")  :  :  :  \\.  .\\%%%%%%/'\"\\%%%%%%/.  ./  :  :  :  (");
        System.out.printf("Hurling Frootmig: So %s, you want to be our newest field editor?",playerName );
        sleepy(3000);
        System.out.println("-------What do you want to say?-------");
        sleepy(3000);
        System.out.println("1: Yes");
        System.out.println("2: No");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1){
                System.out.println("Hurling Frottmig: Great! That's what I like to hear, " + playerName + "! \nI need you to go out and explore the unknown. When you find some new and interesting information just add it to the guide.  When you get at least 10 entries to the guide come back and see me for your pay.");
                enterScanner.nextLine();
                starport();
            }

        }
        else if(choice==2){
            System.out.println("Hurling Frottmig: Well thanks for wasting my time!\n");
            sleepy(3000);
            dead();

        }
    }

    public void starport(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are at the Starport. Where would you like to go\n\n");
        System.out.println("1: Go north");
        System.out.println("2: Go east");
        System.out.println("3: Go south");
        System.out.println("4: Megadodo Publications");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1){
            north();
        }
        else if(choice==2){
            east();
        }
        else if(choice==3){
            townGate();
        }
        else if(choice==4){
            west();
        }
        else{
            starport();
        }
    }

    public void north(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("There is a river. You drink the water and rest at the riverside.");
        System.out.println("Your HP is recovered.");
        playerHP = playerHP + 1;
        System.out.println("Your HP: " + playerHP);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1){
            crossRoad();
        }
        else{
            north();
        }
    }

    public void east(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You walked into a forest and found a Long Sword!");
        playerWeapon = "Long Sword";
        System.out.println("Your Weapon: "+ playerWeapon);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1){
            crossRoad();
        }
        else{
            east();
        }
    }

    public void west(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You encounter a goblin!\n");
        System.out.println("1: Fight");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1){
            fight();
        }
        else if(choice==2){
            crossRoad();
        }
        else{
            west();
        }
    }

    public void fight(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Monster HP: " + monsterHP);
        System.out.println("\n1: Attack");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1){
            attack();
        }
        else if(choice==2){
            crossRoad();
        }
        else{
            fight();
        }
    }

    public void attack(){
        int playerDamage =0;


        if(playerWeapon.equals("Towel")){
            playerDamage = new java.util.Random().nextInt(5);
        }
        else if(playerWeapon.equals("Beach Towel")){
            playerDamage = new java.util.Random().nextInt(8);
        }

        System.out.println("You attacked the monster and gave " + playerDamage + " damage!");

        monsterHP = monsterHP - playerDamage;

        System.out.println("Monster HP: " + monsterHP);

        if(monsterHP<1){ win(); } else if(monsterHP>0){
            int monsterDamage =0;

            monsterDamage = new java.util.Random().nextInt(4);

            System.out.println("The monster attacked you and gave " + monsterDamage + " damage!");

            playerHP = playerHP - monsterDamage;

            System.out.println("Player HP: " + playerHP);

            if(playerHP<1){ dead(); } else if(playerHP>0){
                fight();
            }
        }


    }

    public void dead(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are dead!!!");
        System.out.println("\n\nGAME OVER");
        System.out.println("\n------------------------------------------------------------------\n");

    }

    public void win(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You killed the monster!");
        System.out.println("The monster dropped a ring!");
        System.out.println("You obtaind a silver ring!\n\n");
        System.out.println("1: Go east");
        System.out.println("\n------------------------------------------------------------------\n");

        theBook = 10;

        choice = myScanner.nextInt();
        if(choice==1){
            crossRoad();
        }
        else{
            win();
        }

    }

    public void ending(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Guard: Oh you killed that goblin!?? Great!");
        System.out.println("Guard: It seems you are a trustworthy guy. Welcome to our town!");
        System.out.println("\n\n           THE END                    ");
        System.out.println("\n------------------------------------------------------------------\n");
    }
}