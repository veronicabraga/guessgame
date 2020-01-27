public class Main {

    public static void main(String[] args) {

        Player[] players = new Player[] {
                new Player("Vero"),
                new Player("Gabi"),
                new Player("Giza")

        };



        Game game = new Game(30, players);
        game.start();
    }
}
