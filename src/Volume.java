import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть R");
        double R = scanner.nextDouble();
        System.out.println("Введіть h");
        double h = scanner.nextDouble();
        double V = PI* Math.pow(R,2) * h;
        double S = 2 * PI * R * (R + h);
        System.out.println("Об'єм циліндра " + V);
        System.out.println("Площа поверхні циліндра " + S);
    }
}
