public final class Application {

public static void main(String[] args) throws InterruptedException {
        GameClasses.Branches.StartingScreen.firstMessage();
        GameClasses.Branches.FirstUnknown.firstUnknownInit();
        GameClasses.Branches.Carwash.carwashInit();
        GameClasses.Branches.CarDrive.CarDriveInit();
        GameClasses.Branches.SecondUnknown.secondUnknownInit(); 
        GameClasses.Branches.Apartment.apartmentInit();
        GameClasses.Branches.Epilogue.epilogueInit();
    }
}   
