public class Game {

    private Player player;
    private int max;


    public Game(String name, int max) {
        player = new Player(name);
        this.max = max;
    }
        public void start() {

            int numPlayer = player.pickNumber(max);;

            System.out.println("Let's start the game!");
            int numGame = pickNumber(max);
            System.out.println("I chose a number from 0 to " + max + ". Guess what is the number!");
            System.out.println("I, " + player.getName() + ", say that you chose number " + numPlayer + ".");

            while(numGame != numPlayer) {
                System.out.println("Iiihhh, wrong number... Guess again!");
                numPlayer = player.pickNumber(max);
                System.out.println("I, " + player.getName() + ", say that you chose number " + numPlayer + ".");

            }

            System.out.println("Wow! You guessed! Congratulations!");
            System.out.println("I have chosen " + numGame + ".");

        }

        public int pickNumber(int max) {
            int numGame = Randomizer.getRandom(max);
            return numGame;
        }




}
