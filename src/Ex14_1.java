import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Width");
        double width = input.nextDouble();
        System.out.println("Enter the Height");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your rectangle: " + rectangle.display());
        System.out.println("Area is: " + rectangle.getArea());
        System.out.println("Perimeter is: " + rectangle.getPerimeter());
    }
}
