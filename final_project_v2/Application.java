public class Application {
public static void main(String[] args) throws InterruptedException {
    while (!GameClasses.GameMechanics.quitGame) {
        GameClasses.Branches.StartingScreen.firstMessage();
        GameClasses.Branches.FirstUnknown.firstUnknownInit();
        GameClasses.Branches.Carwash.carwashInit(); 
    }
}   
}
