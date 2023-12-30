import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Seleccione una operacion: ");
        System.out.println("1. Sumar");
        System.out.println("5. Salir");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        while (opcion != 5) {
            System.out.println("Ingrese el primer numero: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            int num2 = sc.nextInt();
            switch (opcion) {
                case 1:
                    Sumar sumar = new Sumar(num1, num2);
                    System.out.println("El resultado es: " + sumar.getResultado());
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("Seleccione una operacion: ");
            System.out.println("1. Sumar");

            opcion = sc.nextInt();
        }
    }
}
