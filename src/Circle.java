import java.util.Scanner;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String display() {
        return "Circle {" + "radius = " + radius + ", color = " + color + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập radius:");
        double radius = scanner.nextDouble();

        System.out.println("Nhập color:");
        scanner.nextLine();
        String color = scanner.nextLine();

        Circle circle = new Circle(radius, color);

        System.out.println("Your Circle \n" + circle.display());
        System.out.println("Radius of Circle: " + circle.getRadius());
        System.out.println("Area of Circel: " + circle.getArea());
    }
}
