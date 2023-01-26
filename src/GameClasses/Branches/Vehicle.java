package GameClasses.Branches;

public interface Vehicle {
    Vehicle accelerate(int factor);
    Vehicle brake(int factor);
    String currentSpeed();
}