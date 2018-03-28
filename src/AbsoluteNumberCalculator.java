import java.util.Scanner;

public class AbsoluteNumberCalculator {
    public static double getAbsolute (double number) {
        if (number < 0) return -number;
        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        double number = input.nextDouble();
        double absNumber = getAbsolute(number);
        System.out.print("|"+ number + "|= "+ absNumber);
    }
}
