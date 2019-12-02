package DontPanic;

import java.util.Scanner;
import java.util.Random;

public class TurtleBear {
    static String userName;
    static int userHealth;
    static int userGuard;
    static int userStrength;
    static String firstName;
    static String enemyName;
    static int enemyStrength;
    static int enemyHealth;
    static int enemyGuard;
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    static int i = 0;
    static int j = 0;

    //*********************//
    // BEGIN SETTING IT UP //
    //*********************//
    //****************************//
    // RANDOM VARIABLE GENERATORS //
    //****************************//

    static Random rando = new Random();
    static int rando_int = rando.nextInt(9);
    static int rando_intTwo = rando.nextInt(9);
    static int newEnemyStrength = rando.nextInt(10)+1;
    static int newEnemyHealth = rando.nextInt(10)+1;
    static int newEnemyGuard = rando.nextInt(10)+1;
    static int newUserStrength = rando.nextInt(10)+1;
    static int newUserHealth = rando.nextInt(10)+1;
    static int newUserGuard = rando.nextInt(10)+1;
    static int enemyChoice = rando.nextInt(1);
    static int userBonusDefense = 0;
    static int enemyBonusDefense = 0;

    //******************//
    // GENERATOR ARRAYS //
    //******************//

    static String[] firstEvilName = new String[]{"Tilfor","Onslow","Patton","Northcliffe","James", "Rider", "Goldgaze", "Silverpelt", "J.W.", "Jacob"};
    static String[] lastEvilName = new String[]{"Steamwraith", "Embersnare", "Dreamscream", "Vapor", "Franco", "Duskbluff", "Goreflare", "Dawntoe", "Barrow", "Hester"};
    static String newEnemyName = firstEvilName[rando_int] + " " + lastEvilName[rando_intTwo];
    static String[] enemyChoices = new String[]{"ATTACK", "DEFENSE"};




    public static void settingUp() {
        System.out.printf("%n%nGreetings human!! %n");
        sleepy(1000);
        System.out.printf("Welcome to...%n%n");
        sleepy(1500);

        System.out.println("  ____  _                   __   _____ _          \n" +
                " |  _ \\(_)___  ___    ___  / _| |_   _| |__   ___ \n" +
                " | |_) | / __|/ _ \\  / _ \\| |_    | | | '_ \\ / _ \\\n" +
                " |  _ <| \\__ \\  __/ | (_) |  _|   | | | | | |  __/\n" +
                " |_| \\_\\_|___/\\___|  \\___/|_|     |_| |_| |_|\\___|\n" +
                "                                                  ");
        System.out.println(" _____ _   _______ _____ _      _____  ______ _____  ___  ______ \n" +
                "|_   _| | | | ___ \\_   _| |    |  ___| | ___ \\  ___|/ _ \\ | ___ \\\n" +
                "  | | | | | | |_/ / | | | |    | |__   | |_/ / |__ / /_\\ \\| |_/ /\n" +
                "  | | | | | |    /  | | | |    |  __|  | ___ \\  __||  _  ||    / \n" +
                "  | | | |_| | |\\ \\  | | | |____| |___  | |_/ / |___| | | || |\\ \\ \n" +
                "  \\_/  \\___/\\_| \\_| \\_/ \\_____/\\____/  \\____/\\____/\\_| |_/\\_| \\_|");
        System.out.println(" :\"'._..---.._.'\";                  ___-------___\n" +
                " `.             .'              _-~~             ~~-_\n" +
                "  .'    ^   ^    `.         _-~                    /~-_\n" +
                " :      a   a      :      /~  \\                   /    \\\n" +
                " :     _.-0-._     :     /      \\_______________/        \\\n" +
                "  :  .'   :   `.  :   /       /                \\          \\\n" +
                "   `.: '--'--' :.'   /      /                    \\          \\\n" +
                "      `._`-'_.'     /______/                        \\_________ \\\n" +
                "        '\"'   \\   /         \\                      /            \\\n" +
                "        \\        \\^\\\\         \\                  /               \\     /\n" +
                "         \\         ||           \\______________/      _-_       //\\__//\n" +
                "           \\       ||------_-~~-_ ------------- \\ --/~   ~\\    || __/\n" +
                "             ~-----||====/~     |==================|       |/~~~~~\n" +
                "              (_(__/  ./     /                    \\_\\      \\.\n" +
                "                   (_(___/                         \\_____)_)");

        sleepy(4000);
        System.out.printf("This is an automated text adventure, which means that the prompts will go ahead on their own!%n%n");
        sleepy(2000);
        System.out.printf("No need to press \"ENTER\" or anything silly like that when the narration is going on.%n%n");
        sleepy(2000);
        System.out.printf("Feel free to press \"ENTER\" when you're done with your responses, though!%n%n");
        sleepy(2500);
        System.out.printf("Okay... Let's get this show on the road!!%n%n");
        sleepy(3000);
        System.out.printf("Are you prepared to fight in the%n");
        sleepy(1500);
        System.out.printf("MOST EXTREME,%n");
        sleepy(1000);
        System.out.printf("ONE ON ONE,%n");
        sleepy(1000);
        System.out.printf("MAXIMUM,%n");
        sleepy(1000);
        System.out.printf("DEATH COMBAT?%n");
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("yep")) {

            System.out.println("Great! Let's do this!");
        } else {
            System.out.printf("Whatever! Let's do this! %n");
        }
        System.out.printf("What is your name?%n");
        userName = sc.next();
        System.out.printf("%s, eh?%n",userName);
        sleepy(1500);
        System.out.printf("%nSounds like the epic name of a super-winner! %n");
        sleepy(1500);
        System.out.printf("I'm sure your parents are very proud of you.%n");
        sleepy(1500);
        System.out.printf("%nNow tell me, %s.", userName);
        sleepy(1500);

        do {
            System.out.printf("%nDo you want to cheat and DESIGN your own enemy%n");
            sleepy(1500);
            System.out.printf("or play fairly and just let us do the talking? %n");
            sleepy(1500);
            System.out.printf("Type \"CHEAT\" or \"PLAY FAIR\"%n");
            String userCheat = sc.next();
            if (userCheat.equalsIgnoreCase("cheat")) {
                System.out.printf("*Sigh* Okay, %s. Have it your way.%n", userName);
                characterCreation();
                return;
            } else if (userCheat.equalsIgnoreCase("play fair")) {
                newJourney(enemyName, enemyStrength,enemyGuard, enemyHealth, userName, userStrength, userGuard, userHealth);
                return;
            } else {
                System.out.printf("That's not an option, I'm afraid.");
            }
        } while (true);
    }

    //********************//
    // DESIGNING YOURSELF //
    //********************//

    public static void characterCreation() {
        System.out.println("Please tell me your of your might. STRENGTH: (1-10)\n");
        byte userStrength = sc.nextByte();
        System.out.printf("And how tough are you? DEFENSE: (1-10)%n");
        byte userGuard = sc.nextByte();
        System.out.printf("What of your vitality? HP: (1-10)%n");
        byte userHealth = sc.nextByte();
        if (userStrength == 10 && userGuard == 10 && userHealth == 10) {
            System.out.printf("%n...%n");
            sleepy(1000);
            System.out.printf("Seriously %s.", userName);
            sleepy(1000);
            System.out.printf("%nYou gave yourself all 10's?");
            sleepy(1500);
            System.out.printf("%nWell, whatever. Let's keep going.%n%n");
        };
        sleepy(1500);

        //*********************//
        // DESIGNING THE ENEMY //
        //*********************//

        System.out.printf("Tell me, mighty warrior: %nWhat is the name of the foe you will face in glorious combat? Name: %n");
        j++;
        enemyName = sc.next();
        System.out.printf("And what is %s's strength? STRENGTH: (1-10)%n", enemyName);
        byte enemyStrength = sc.nextByte();
        System.out.printf("And what of their toughness? GUARD: (1-10)%n");
        byte enemyGuard = sc.nextByte();
        System.out.printf("Is their health even comparable to yours? HP: (1-10)%n");
        byte enemyHealth = sc.nextByte();
        if (enemyStrength == 1 && enemyGuard == 1 && enemyHealth == 1) {
            sleepy(1000);
            System.out.printf("......%n%n");
            sleepy(1500);
            System.out.printf("You really aren't going to make this game very fun if you keep cheating like this.%n%n");
            sleepy(3000);
        }

        //******************//
        // CONFIRMING STATS //
        //******************//

        System.out.println("Okay! Well, there we go.");
        sleepy(1000);
        System.out.printf("%nTwo mighty warriors preparing to face battle.");
        sleepy(1000);
        System.out.printf("%nLet's make sure I heard you correctly: %n%n");
        sleepy(2000);
        System.out.printf("--------------  %n %s's Stats: %n -----------%n Strength: %s %n Guard: %s %n HP: %s %n ==============%n", userName, userStrength, userGuard, userHealth);
        sleepy(5000);
        System.out.printf("%s's Stats: %n -------------- %n Strength: %s %n Guard %s %n HP %s %n -----------%n%nIs this all correct?%n", enemyName, enemyStrength, enemyGuard, enemyHealth, userName, userStrength, userGuard, userHealth);
        String userConfirm = sc.next();
        if (userConfirm.equalsIgnoreCase("yes")) {
            sleepy(1000);
            System.out.printf("%n%nAt last! %s, it is time to begin your Journey...%n", userName);
            sleepy(1000);
            newJourney(enemyName, enemyStrength, enemyGuard, enemyHealth, userName, userStrength, userGuard, userHealth);
        } else {
            System.out.printf("Well, shoot. Let's try again.%n");
            characterCreation();
        }
    }



    //***************//
    //  PRE-JOURNEY  //
    //***************//

    public static void newJourney(String enemyName, int enemyHealth, int enemyGuard, int enemyStrength, String userName, int userHealth, int userGuard, int userStrength) {
        System.out.printf("%n==========================%nTHE JOURNEY%n==========================%n");
        System.out.printf("You find yourself staring at a brightly lit computer screen, %nreading a text prompt in the guise of a role-playing game. What would you like to do?%n%n");
        String badInput = sc.next();
        System.out.printf("%n%nWell that's gibberish.%n");
        sleepy(1500);
        System.out.printf("\"%s.\"", badInput);
        sleepy(1000);
        System.out.printf("%n Means nothing to me.");
        sleepy(1500);
        System.out.printf("%n Okay, this won't work. Let's get more specific...%n");
        journeyBegins(enemyName,enemyHealth,enemyGuard,enemyStrength,userName, userHealth, userGuard, userStrength);
    }

    //****************//
    // JOURNEY BEGINS //
    //****************//

    public static void journeyBegins(String enemyName, int enemyHealth, int enemyGuard, int enemyStrength, String userName, int userHealth, int userGuard, int userStrength) {
        if (j > 0) {
            newEnemyName = enemyName;
            newEnemyStrength = enemyStrength;
            newEnemyGuard = enemyGuard;
            newEnemyHealth = enemyHealth;
            newUserStrength = userStrength;
            newUserGuard = userGuard;
            newUserHealth = userHealth;
        }
        System.out.printf("Have you ever battled an angry TurtleBear?%n");
        String userResponse = sc.next();
        if (userResponse.equalsIgnoreCase("yes")) {
            System.out.printf("%nWell then you're in luck!%n");
            sleepy(1500);
            System.out.printf("%nToday will be drastically different!%n");
            sleepy(1500);
            System.out.printf("%nToday you will fight the amorphous,%n");
            sleepy(1500);
            System.out.printf("nuclear-powered,%n");
            sleepy(1500);
            System.out.printf("maximum-kill-boss %n");
            sleepy(1500);
            System.out.printf("captain of the slime-death army: %s!!%n%n", newEnemyName);
            sleepy(3000);
            System.out.printf("%n====================%n%s's Stats:%n---------------------%nStrength: %d%nDEFENSE: %d%nHP: %d%n============%n",newEnemyName, newEnemyStrength, newEnemyGuard, newEnemyHealth);
            sleepy(4000);
            System.out.printf("%n====================%n%s's Stats:%n---------------------%nStrength: %d%nDEFENSE: %d%nHP: %d%n============%n", userName, newUserStrength, newUserGuard, newUserHealth);
            System.out.printf("Prepare yourself...%n");
            sleepy(2000);
            theFight(enemyName,enemyHealth,enemyGuard,enemyStrength,userName,userHealth,userGuard,userStrength);
        } else if (userResponse.equalsIgnoreCase("no")) {
            System.out.printf("%nWell then you're in luck!%n");
            sleepy(1500);
            System.out.printf("%nToday will be no different!%n");
            sleepy(1500);
            System.out.printf("%nToday you will fight the amorphous,%n");
            sleepy(1500);
            System.out.printf("nuclear-powered,%n");
            sleepy(1500);
            System.out.printf("maximum-kill-boss %n");
            sleepy(1500);
            System.out.printf("captain of the slime-death army: %s!!%n%n", newEnemyName);
            sleepy(3000);
            System.out.printf("%n====================%n%s's Stats:%n---------------------%nStrength: %d%nDEFENSE: %d%nHP: %d%n============%n",newEnemyName, newEnemyStrength, newEnemyGuard, newEnemyHealth);
            sleepy(4000);
            System.out.printf("%n====================%n%s's Stats:%n---------------------%nStrength: %d%nDEFENSE: %d%nHP: %d%n============%n", userName, newUserStrength, newUserGuard, newUserHealth);
            System.out.printf("Prepare yourself...%n");
            sleepy(2000);
            theFight(enemyName, enemyStrength, enemyGuard, enemyHealth, userName,userHealth,userGuard,userStrength);
        } else if (i > 0) {
            System.out.println("You think you're clever, don't you?");
            sleepy(1500);
            System.out.printf("%nYou think you can just go around breaking the rules and get away with it? %n%n");
            sleepy(2000);
            System.out.printf("Well, now you're going to have to fight TWO Turtle Bears!");
            sleepy(3000);
            System.out.printf("%n How do you feel about that?%n%n");
            sleepy(2000);
            System.out.printf("Wait... %n%n");
            sleepy(1500);
            System.out.printf("Oh...%n%n");
            sleepy(1500);
            System.out.printf("They're telling me that we don't have any Turtle Bears for you to fight.%n");
            sleepy(2000);
            System.out.printf("%nSpeaking of which...%n%n");
            journeyBegins(enemyName,enemyHealth,enemyGuard,enemyStrength,userName,userHealth,userGuard,userStrength);
        } else {
            System.out.printf("%n Type \"YES\" or \"NO\", please.%n");
            i++;
            journeyBegins(enemyName,enemyHealth,enemyGuard,enemyStrength,userName,userHealth,userGuard,userStrength);

        }
    }

    //*****************//
    // BEGIN THE FIGHT //
    //*****************//

    public static void theFight(String enemyName, int enemyHealth, int enemyGuard, int enemyStrength, String userName, int userHealth, int userGuard, int userStrength) {
        System.out.printf("=========================================%nTIME TO FIGHT%n=========================================%n");
        while(true) {
            System.out.printf("%n%n===========================================%n%n| CHOOSE YOUR MOVE |           YOUR STATS |%n------------------------------------------- %n| ATTACK |               YOUR STRENGTH: %d |%n| DEFEND |                  YOUR DEFENSE: %d |%n| PRAY |                       YOUR HP: %d |%n", newUserStrength, newUserGuard, newUserHealth);
            System.out.printf("===========================================%n");
            sleepy(3000);
            String userMove = sc.next();

            //***********//
            // YOUR TURN //
            //***********//
            userBonusDefense = 0;
            if (userMove.equalsIgnoreCase("attack")) {
                if (newEnemyGuard + enemyBonusDefense >= newUserStrength) {
                    newEnemyHealth--;
                    sleepy(2000);
                    System.out.printf("You attacked for %d hit points! %s's health is now  %d%n", newUserStrength, newEnemyName, newEnemyHealth);
                    sleepy(1000);
                    if (newEnemyHealth < 1) {
                        winCredits();
                        return;
                    }
                } else {
                    newEnemyHealth -= (newUserStrength);
                    sleepy(2000);
                    System.out.printf("You attacked for %d hit points! %s's health is now  %d%n", newUserStrength, newEnemyName, newEnemyHealth);
                    sleepy(1000);
                    if (newEnemyHealth < 1) {
                        winCredits();
                        return;
                    }
                }

            } else if (userMove.equalsIgnoreCase("defend")) {
                userBonusDefense += 10;
                System.out.printf("Your defense is now SUPERCHARGED!%n");
                sleepy(2000);
            } else if (userMove.equalsIgnoreCase("pray")) {
                System.out.println(userName + "'s prayer is heard by God.  You feel invigorated and recover " + (newUserHealth += 2) + " health!");
                sleepy(2000);
            } else {
                System.out.println("You stand around, sipping tea and thinking about Yu-Gi-Oh, rather than do anything productive with your life. YOU FORFEIT YOUR TURN.");
                sleepy(4000);
            }

            //************//
            // ENEMY TURN //
            //************//

            System.out.printf("%n%n========================%n%s's turn!%n========================%n%n", newEnemyName);
            System.out.printf("He's going to " + enemyChoices[enemyChoice] + "%n");
            sleepy(2000);
            if (enemyChoices[enemyChoice].equalsIgnoreCase("attack")) {
                if (newUserGuard + userBonusDefense >= newEnemyStrength) {
                    newUserHealth--;
                    System.out.printf("He attacked for %d and your health is now %d%n", newEnemyStrength, newUserHealth);
                    sleepy(3000);
                    if (newUserHealth < 1) {
                        loseCredits();
                        return;
                    }
                } else if (newUserGuard + userBonusDefense < newEnemyStrength){
                    newUserHealth -= newEnemyStrength;
                    System.out.printf("He attacked for %d and your health is now %d%n", newEnemyStrength, newUserHealth);
                    sleepy(3000);
                    if (newUserHealth < 1) {
                        loseCredits();
                        return;
                    }

                }
            } else if (enemyChoices[enemyChoice].equalsIgnoreCase("defend")) {
                enemyBonusDefense += 10;
                sleepy(2000);
            }
        }
    }






    //***************//
    // CONSOLE DELAY //
    //***************//

    public static void sleepy(int num) {
        try {
            Thread.sleep(num);
        } catch (Exception e) {
            System.out.println("yep");
        }
    }

    //*****************//
    // CLOSING METHODS //
    //*****************//

    public static void winCredits() {
        System.out.printf(" _____                             _         _       _   _                 _  \n" +
                "/  __ \\                           | |       | |     | | (_)               | | \n" +
                "| /  \\/ ___  _ __   __ _ _ __ __ _| |_ _   _| | __ _| |_ _  ___  _ __  ___| | \n" +
                "| |    / _ \\| '_ \\ / _` | '__/ _` | __| | | | |/ _` | __| |/ _ \\| '_ \\/ __| | \n" +
                "| \\__/\\ (_) | | | | (_| | | | (_| | |_| |_| | | (_| | |_| | (_) | | | \\__ \\_| \n" +
                " \\____/\\___/|_| |_|\\__, |_|  \\__,_|\\__|\\__,_|_|\\__,_|\\__|_|\\___/|_| |_|___(_) \n" +
                "                    __/ |                                                     \n" +
                "                   |___/                                                      \n" +
                "__   __                     _       _                                         \n" +
                "\\ \\ / /                    (_)     | |                                        \n" +
                " \\ V /___  _   _  __      ___ _ __ | |                                        \n" +
                "  \\ // _ \\| | | | \\ \\ /\\ / / | '_ \\| |                                        \n" +
                "  | | (_) | |_| |  \\ V  V /| | | | |_|                                        \n" +
                "  \\_/\\___/ \\__,_|   \\_/\\_/ |_|_| |_(_)                                        \n" +
                "                                                                              \n" +
                "                                                ");
        System.out.println(" :\"'._..---.._.'\";                  ___-------___\n" +
                " `.             .'              _-~~             ~~-_\n" +
                "  .'             `.         _-~                    /~-_\n" +
                " :      X   X      :      /~  \\                   /    \\\n" +
                " :     _.-0-._     :     /      \\_______________/        \\\n" +
                "  :  .'   :   `.  :   /       /                \\          \\\n" +
                "   `.: '--'--' :.'   /      /                    \\          \\\n" +
                "      `._`-'_.'     /______/                        \\_________ \\\n" +
                "         |||       /         \\                      /            \\\n" +
                "         |||       \\\\         \\                  /               \\  \n" +
                "         |||      ||           \\______________/      _-_       //\\_\n" +
                "         |||     ||------_-~~-_ ------------- \\ --/~   ~\\    || __/\n" +
                "         |||    -||====/~     |==================|       |/~~~~~");
    }

    public static void loseCredits() {
        System.out.println(" _____            _        __   __                _                _          __\n" +
                "|  _  |          | |       \\ \\ / /               | |              | |    _   / /\n" +
                "| | | |_   _  ___| |__      \\ V /___  _   _    __| | ___  __ _  __| |   (_) | | \n" +
                "| | | | | | |/ __| '_ \\      \\ // _ \\| | | |  / _` |/ _ \\/ _` |/ _` |       | | \n" +
                "\\ \\_/ / |_| | (__| | | |_    | | (_) | |_| | | (_| |  __/ (_| | (_| |_   _  | | \n" +
                " \\___/ \\__,_|\\___|_| |_(_)   \\_/\\___/ \\__,_|  \\__,_|\\___|\\__,_|\\__,_(_) (_) | | \n" +
                "                                                                             \\_\\\n" +
                "                                                                                \n" +
                " _____   ___  ___  ___ _____   _____  _   _ ___________                         \n" +
                "|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\                        \n" +
                "| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ /                        \n" +
                "| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    /                         \n" +
                "| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\                         \n" +
                " \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_|                        \n" +
                "                                                                                \n" +
                "                                                                    ");
        System.out.println(" :\"'._..---.._.'\";                  ___-------___\n" +
                " `.             .'              _-~~             ~~-_\n" +
                "  .'    ^   ^    `.         _-~                    /~-_\n" +
                " :      a   a      :      /~  \\                   /    \\\n" +
                " :     _.-0-._     :     /      \\_______________/        \\\n" +
                "  :  .'   :   `.  :   /       /                \\          \\\n" +
                "   `.: '--'--' :.'   /      /                    \\          \\\n" +
                "      `._`-'_.'     /______/                        \\_________ \\\n" +
                "        '\"'   \\   /         \\                      /            \\\n" +
                "        \\        \\^\\\\         \\                  /               \\     /\n" +
                "         \\         ||           \\______________/      _-_       //\\__//\n" +
                "           \\       ||------_-~~-_ ------------- \\ --/~   ~\\    || __/\n" +
                "             ~-----||====/~     |==================|       |/~~~~~\n" +
                "              (_(__/  ./     /                    \\_\\      \\.\n" +
                "                   (_(___/                         \\_____)_)");
    }
    public static void main(String[] args) {
        settingUp();

    }

}
