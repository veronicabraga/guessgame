public class Randomizer {

    public static int getRandom(int max) {

        int randomNum = (int)Math.ceil(Math.random() * max);
        return randomNum;

    }
}
