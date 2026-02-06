import java.util.Scanner;

class AreaCalculator {

    float calculateArea(float radius) {
        return (float)(Math.PI * radius * radius);
    }

    float calculateArea(float length, float breadth) {
        return length * breadth;
    }

    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();
        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        float circleArea = ac.calculateArea(radius);
        float rectangleArea = ac.calculateArea(length, breadth);
        double triangleArea = ac.calculateArea(base, height);

      
        System.out.printf("%.2f\n", circleArea);
        System.out.printf("%.2f\n", rectangleArea);
        System.out.printf("%.2f\n", triangleArea);

        sc.close();
    }
}
