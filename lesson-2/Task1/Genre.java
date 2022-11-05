package Task1;

final class Genre {
    String genre;
    String cameraposition;

    Genre(String genre, String cameraposition) {
        this.genre = genre;
        this.cameraposition = cameraposition;
    }

    void kind() {
        System.out.println("Genre of the game is: " + genre + ", and it has " + cameraposition + " point of view.");
    }
}
