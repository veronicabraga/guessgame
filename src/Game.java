public class Game {

    private Player[] players;
    private int max;


    public Game(int max, Player[] players) {
        this.players = players;
        this.max = max;
    }

    public void start() {

            System.out.println("Let's start the game!");
            int numGame = pickNumber(max);
            System.out.println("I chose a number from 0 to " + max + ". Guess what is the number!");
            boolean status = true;

            while (status) {
                for (Player player : players) {

                    int numPlayer = player.pickNumber(max);
                    System.out.println("I, " + player.getName() + ", say that you chose number " + numPlayer + ".");

                    if (numGame != numPlayer) {
                        System.out.println("Iiihhh, wrong number... Guess again!");


                    } else {
                        System.out.println("Wow! You guessed! Congratulations!");
                        System.out.println("I have chosen " + numGame + ".");
                        status = false;
                        break;

                    }
                }
            }

    }



    public int pickNumber(int max) {
        int numGame = Randomizer.getRandom(max);
        return numGame;
    }


}
