import java.util.Scanner;

public class volume {

    // Method to calculate the volume of a cube
    private static double calculateCubeVolume(double side) {
        return Math.pow(side, 3);
    }

    // Method to calculate the volume of a rectangular prism
    private static double calculateRectangularPrismVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Method to calculate the volume of a cylinder
    private static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Volume Calculator Application");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Prism");
        System.out.println("3. Cylinder");
        System.out.print("Choose a shape to calculate the volume (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Cube
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                double cubeVolume = calculateCubeVolume(side);
                System.out.println("The volume of the cube is: " + cubeVolume);
                break;

            case 2: // Rectangular Prism
                System.out.print("Enter the length of the rectangular prism: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangular prism: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the rectangular prism: ");
                double height = scanner.nextDouble();
                double rectangularPrismVolume = calculateRectangularPrismVolume(length, width, height);
                System.out.println("The volume of the rectangular prism is: " + rectangularPrismVolume);
                break;

            case 3: // Cylinder
                System.out.print("Enter the radius of the cylinder: ");
                double radius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = scanner.nextDouble();
                double cylinderVolume = calculateCylinderVolume(radius, cylinderHeight);
                System.out.println("The volume of the cylinder is: " + cylinderVolume);
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }

        scanner.close();
    }
}
