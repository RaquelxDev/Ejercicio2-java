import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Ingresa el valor de 'b': ");
        double b = scanner.nextDouble();

        double resultado = (a + b) * (a - b);

        System.out.println("El resultado de la operación es: " + resultado);
    }
}
