package Task2;

interface Vehicle {
    Vehicle accelerate(int factor);
    Vehicle brake(int factor);
    Vehicle fuel_level();
    Vehicle final_distance();
}

class Car implements Vehicle {
    private int current_speed;
    private int distance;
    private int fuel_level;

    Car (int current_speed, int distance, int fuel_level) {
        this.current_speed = current_speed;
        this.distance = distance;
        this.fuel_level = fuel_level;
    }
    @Override
    public Vehicle accelerate(int factor) {
        this.current_speed += factor;
        System.out.println("Accelerating the car by " + this.current_speed);
        return new Car(this.current_speed, distance, fuel_level);
    }

    public Vehicle brake(int factor) {
        System.out.println("Braking the car by " + this.current_speed);
        this.current_speed -= factor;
        this.distance += factor;
        this.fuel_level -= factor;
        return new Car(this.current_speed, this.distance, this.fuel_level);
    }
    
    public Vehicle fuel_level() {
        System.out.println("Current fuel level of the car: " + this.fuel_level);
        if ((this.fuel_level <= 10) && (this.fuel_level >= 1)) {
            System.out.println("Low amount of fuel!");
        } else if (this.fuel_level == 0) {
            System.out.println("No fuel!");
        }
        return null;
    }

    public Vehicle final_distance(){
        System.out.println("Distance traveled by the car: " + distance);
        return null;
    }
} 

class Truck implements Vehicle {
    private int current_speed;
    private int distance;
    private int fuel_level;
    Truck (int current_speed, int distance, int fuel_level) {
        this.current_speed = current_speed;
        this.distance = distance;
        this.fuel_level = fuel_level;
    }
    @Override
    public Vehicle accelerate(int factor) {
        this.current_speed += factor;
        System.out.println("Accelerating the truck by " + this.current_speed);
        return new Truck(this.current_speed, this.distance, fuel_level);
    }

    public Vehicle brake(int factor) {
        System.out.println("Braking the truck by " + this.current_speed);
        this.current_speed -= factor;
        this.distance += factor;
        this.fuel_level -= factor;
        return new Truck(this.current_speed, this.distance, this.fuel_level);
    }

    public Vehicle fuel_level() {
        System.out.println("Current fuel level of the truck: " + this.fuel_level);
        if ((this.fuel_level <= 10) && (this.fuel_level >= 1)) {
            System.out.println("Low amount of fuel!");
        } else if (this.fuel_level == 0) {
            System.out.println("No fuel!");
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