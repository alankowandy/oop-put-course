package Task1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.make = "Mazda";
        car.model = "CX-5";
        car.year = 2018;

        Owner owner = new Owner();
        owner.name = "Mr. X";
        owner.age = 35;

        System.out.println("Owner's name is " + owner.name + " and the car they have is " + car.make + " " + car.model);
        System.out.println("Owner's age is " + owner.age + " and the car they have is from " + car.year);
    }
}
