public class pruebaCalculadora {
    
    /*
     * This is the main method of the program.
     * @param numero1 The first number of the operation.
     * @param numero2 The second number of the operation.
     * @param operacion The operation to be performed.
     * @return The result of the operation.
     * @see Calculadora
     * @msuabar049
     */
     
    public static void main(String[] args) {
        //Suma
        Calculadora calculadora = new Calculadora(2, 3, "+");
        calculadora.realizarOperacion();
        System.out.println("Suma: "+calculadora.getResultado());

        //Multiplicación
        Calculadora calculadora2 = new Calculadora(2, 3, "*");
        calculadora2.realizarOperacion();
        System.out.println("Multiplicación: "+calculadora2.getResultado());

        //División  
        Calculadora calculadora3 = new Calculadora(2, 3, "/");
        calculadora3.realizarOperacion();
        System.out.println("División: "+calculadora3.getResultado());
        
    }
}
