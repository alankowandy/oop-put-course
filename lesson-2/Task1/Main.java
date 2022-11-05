package Task1;

public class Main {
    public static void main(String[] args) {
        Genre genre = new Genre("RPG adventure", "third person");
        Title title = new Title("Witcher", "Wiedzmin");
        Game game = new Game(genre, title, "CD Project Red", 10);
        genre.kind();
        title.titles();
        game.message();    
    }
}