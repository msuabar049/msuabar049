public class pruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(2, 3, "+");
        calculadora.realizarOperacion();
        System.out.println(calculadora.getResultado());
    }
}
