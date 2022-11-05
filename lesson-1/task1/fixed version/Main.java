package Task1;

final class Owner {
    String name;
    int age;
}

final class Car {
    String make;
    String model;
    int year;
    Owner car_owner;

    void message() {
        System.out.println("Owner's name is " + car_owner.name + " and the car they have is " + make + " " + model);
        System.out.println("Owner's age is " + car_owner.age + " and the car they have is from " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.name = "Mr. X";
        owner.age = 35;
        
        Car car = new Car();
        car.make = "Mazda";
        car.model = "CX-5";
        car.year = 2018;
        car.car_owner = owner;

        car.message();
    }
}
