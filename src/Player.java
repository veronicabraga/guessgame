public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int pickNumber(int max) {
        int numPlayer = Randomizer.getRandom(max);
        return numPlayer;
    }

    public String getName() {
        return name;
    }
}
