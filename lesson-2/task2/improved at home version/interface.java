package Task2;

interface Vehicle {
    Vehicle accelerate(int factor);
    Vehicle brake(int factor);
    //final int factor = 50;
    Vehicle fuel_level();
    Vehicle final_distance();
    //int MAXFUEL = 60;
    //String ERORRMSG = "Fuel tank is full!";
}

class Car implements Vehicle {
    private int speed;
    private int distance;
    private int fuel_level;

    Car (int speed, int distance, int fuel_level) {
        this.speed = speed;
        this.distance = distance;
        this.fuel_level = fuel_level;
    }
    @Override
    public Vehicle accelerate(int factor) {
        this.speed += factor;
        System.out.println("Accelerating the car by " + this.speed);
        return new Car(this.speed, distance, fuel_level);
    }

    public Vehicle brake(int factor) {
        System.out.println("Braking the car by " + this.speed);
        this.speed -= factor;
        this.distance += factor;
        this.fuel_level -= factor;
        return new Car(this.speed, this.distance, this.fuel_level);
    }
    
    public Vehicle fuel_level() {
        System.out.println("Current fuel level of the car: " + this.fuel_level);
        if (fuel_level <= 10) {
            System.out.println("Low amount of fuel!");
        }
        return null;
    }

    public Vehicle final_distance(){
        System.out.println("Distance traveled by the car: " + distance);
        return null;
    }
} 

class Truck implements Vehicle {
    private int speed;
    private int distance;
    private int fuel_level;
    Truck (int speed, int distance, int fuel_level) {
        this.speed = speed;
        this.distance = distance;
        this.fuel_level = fuel_level;
    }
    @Override
    public Vehicle accelerate(int factor) {
        this.speed += factor;
        System.out.println("Accelerating the truck by " + this.speed);
        return new Truck(this.speed, this.distance, fuel_level);
    }

    public Vehicle brake(int factor) {
        System.out.println("Braking the truck by " + this.speed);
        this.speed -= factor;
        this.distance += factor;
        this.fuel_level -= factor;
        return new Truck(this.speed, this.distance, this.fuel_level);
    }

    public Vehicle fuel_level() {
        System.out.println("Current fuel level of the truck: " + this.fuel_level);
        if (this.fuel_level <= 10) {
            System.out.println("Low amount of fuel!");
        }
        return null;
    }

    public Vehicle final_distance(){
        System.out.println("Distance traveled by the truck: " + this.distance);
        return null;
    }


    public static void main(String[] args) {
    Car car = new Car(20, 0, 60);
    Truck truck = new Truck(5, 30, 120);
    car.accelerate(20);
    car.brake(60);
    car.fuel_level();
    car.final_distance();
    truck.accelerate(10);
    truck.fuel_level();
    truck.brake(15);
    truck.final_distance();
    }

}