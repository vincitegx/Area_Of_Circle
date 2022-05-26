package area_of_circle;
import java.util.Scanner;
public class Area_Of_Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // we are writing a code to calculate the area of a circle
        int radius;
        double result;
        final double PI = 3.142;
        System.out.println("Enter the value of the radius...");
        radius = input.nextInt();
        result = 3.142 * radius * radius;
        System.out.println("The area of a circle of the given radius "+radius +" is :"+result);
    }
    
}
