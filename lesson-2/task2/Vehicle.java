package task2;

interface Vehicle {
    Vehicle start(int factor);
    Vehicle stop(int factor);
}

class Car implements Vehicle {
    private int speed;
    private final int capacity;
    private double fuel_level;
    Car (int s, int c, double fl) {
        this.speed = s;
        this.capacity = c;
        this.fuel_level = fl;
    }
    @Override
    public Vehicle start(int factor) {
        return new Car(this.speed + factor, 4, 60);
    }

    public Vehicle stop(int factor) {
        return new Car(this.speed - factor, 4, 60);
    }
} 

class Bike implements Vehicle {
    private int speed;
    private final int capacity;
    Bike (int s, int c) {
        this.speed = s;
        this.capacity = c;
    }
    @Override
    public Vehicle start(int factor) {
        return new Bike(this.speed + factor, 1);
    }

    public Vehicle stop(int factor) {
        return new Bike(this.speed - factor, 1);
    }
}
