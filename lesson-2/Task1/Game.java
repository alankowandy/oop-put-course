package Task1;

final class Game {
    private Genre genre;
    private Title title;
    private String developerstudio;
    private int rating;

    Game(Genre genre, Title title, String developerstudio, int rating) {
        this.genre = genre;
        this.title = title;
        this.developerstudio = developerstudio;
        this.rating = rating;
    }

    void message() {
        System.out.println(title.english + " is an " + genre.genre + " game and it's developer studio is " + developerstudio + ".");
        System.out.println("This game's rating is: " + rating + "/10.");
    }
}