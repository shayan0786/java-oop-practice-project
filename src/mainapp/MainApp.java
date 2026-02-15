package mainapp;

import assignment4_shapes.*;
import assignment5_vehicles.*;
import assignment6_employees.*;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("=== ASSIGNMENT 4: SHAPES ===");

        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        System.out.println("\n=== ASSIGNMENT 5: VEHICLES ===");

        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        vehicle.start();
        car.start();
        bike.start();

        System.out.println("\n=== ASSIGNMENT 6: EMPLOYEES ===");

        Payable salaried = new SalariedEmployee(600000);
        Payable contract = new ContractEmployee(500, 40);

        System.out.println("Salaried Employee Monthly Pay: " + salaried.calculatePay());
        System.out.println("Contract Employee Pay: " + contract.calculatePay());
    }
}
