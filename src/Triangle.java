import java.util.Scanner;

public class Triangle {

    public static void help() {

        System.out.println(" ");
        System.out.println("If you want to check correct dimensions, type d");
        System.out.println("If you want to calculate fied, type f");
        System.out.println("If you want to calculate circumference of the figure, type c");
        System.out.println("If you want to calculate hypotenuse, type h");
        System.out.println(" ");
        System.out.println("HELP - type help");
        System.out.println("QUIT - type quit");
        System.out.println(" ");
    }

    public static void makeTriangle(Scanner scanner) {

        double a;
        double b;
        double c;

        System.out.println("Enter dimensions: ");
        System.out.println(" ");
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        System.out.println("c = ");
        c = scanner.nextDouble();

            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.println("You can build a triangle");
            } else {
                System.out.println("You cant't build a triangle");
            }
    }

    public static void field(Scanner scanner) {

        double basis;
        double height;
        double result;

        System.out.println(" ");
        System.out.println("Enter dimensions: ");
        System.out.println(" ");
        System.out.println("Enter basis: ");
        basis = scanner.nextDouble();
        System.out.println("Enter height ");
        height = scanner.nextDouble();

        result = (basis * 0.5) * height;

        System.out.println("Field = " + result);
    }

    public static void circumference(Scanner scanner) {

        double a;
        double b;
        double c;
        double result;

        System.out.println(" ");
        System.out.println("Enter side lenghts: ");
        System.out.println(" ");
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        System.out.println("c = ");
        c = scanner.nextDouble();
        System.out.println(" ");

        result = a + b + c;

        System.out.println("Circumference = " + result);
    }

    public static void hypotenuse(Scanner scanner) {

        double a;
        double b;
        double result;

        System.out.println(" ");
        System.out.println("Enter side lenghts : ");
        System.out.println(" ");
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        System.out.println(" ");

        result = (a * a) + (b * b);

        double element = Math.sqrt(result);

        System.out.println("Hypotenuse = " + element);
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        System.out.println(" ");
        System.out.println("Welcome into Triangles world! What do you want to do?");

        help();

        while (run) {

            String command = scanner.nextLine();

            if (command.equals("d")) {
                makeTriangle(scanner);
                help();
            } else if (command.equals("f")) {
                field(scanner);
                help();
            } else if (command.equals("c")) {
                circumference(scanner);
                help();
            } else if (command.equals("h")) {
                hypotenuse(scanner);
                help();
            } else if (command.equals("help")) {
                help();
            } else if (command.equals("quit")) {
                System.out.println("Good bye");
                run = false;
            }
        }
    }
}