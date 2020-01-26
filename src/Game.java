public class Game {

    private Player player;
    private int max;


    public Game(String name, int max) {
        player = new Player(name);
        this.max = max;
    }
        public void start() {

            int numPlayer;

            System.out.println("Let's start the game!");
            int numGame = pickNumber(max);
            System.out.println("I chose a number from 0 to " + max + ". Guess what is the number!");

            do {
                numPlayer = player.pickNumber(max);
                System.out.println("I, " + player.getName() + ", say that you chose number " + numPlayer + ".");
                if (numGame == numPlayer) {
                    System.out.println("Wow! You guessed! Congratulations!");
                } else {
                    System.out.println("Iiihhh, wrong number... Guess again!");

                }

            } while(numGame != numPlayer);

            System.out.println("I have chosen " + numGame + ".");

        }

        public int pickNumber(int max) {
            int numGame = Randomizer.getRandom(max);
            return numGame;
        }




}
