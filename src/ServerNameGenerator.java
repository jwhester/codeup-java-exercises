import java.util.Random;
public class ServerNameGenerator {
    public static void nameGen() {
        String[] adjs = {"mathematical", "astronomical", "kick-ass", "super-duper", "radical", "cool", "magical", "chocolaty", "fierce", "hyperactive"};
        String[] nouns = {"Tiger", "Monkey", "Chef", "Hacker-Man", "NanDrew", "Dancer", "Scientist", "Doctor", "Mathematician", "Bear"};
        Random random = new Random();
        int adj = random.nextInt(adjs.length);
        int noun = random.nextInt(nouns.length);
        System.out.println(adjs[adj] + "-" + nouns[noun]);
    }

    public static void main(String[] args) {
        nameGen();

    }
}
