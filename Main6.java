import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Premier nombre : ");
        int nb1 = scanner.nextInt();

        System.out.println("Deuxième nombre : ");
        int nb2 = scanner.nextInt();

        System.out.println("Addition : " + addition(nb1, nb2));
        System.out.println("Soustraction : " + soustraction(nb1, nb2));
        System.out.println("Multiplication : " + multiplication(nb1, nb2));
        if (nb2 == 0) {
            System.out.println("Division : Impossible de diviser par 0");
        } else {
            System.out.println("Division : " + division(nb1, nb2));
        }
        

        scanner.close();
    }

    static int addition(int a, int b) {
        return a + b;
    }

    static int soustraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static double division(int a, int b) {
        return (double) a / b;
    }
}