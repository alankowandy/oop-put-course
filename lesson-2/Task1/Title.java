package Task1;

final class Title {
    String english;
    String polish;

    Title(String english, String polish) {
        this.english = english;
        this.polish = polish;
    }

    void titles() {
        System.out.println("English title of the game is: " + english + ", and the polish title is: " + polish + ".");
    }
}
