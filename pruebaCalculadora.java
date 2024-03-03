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
        //suma
        Calculadora calculadora = new Calculadora(2, 3, "+");
        calculadora.realizarOperacion();
        System.out.println("Suma: "+calculadora.getResultado());
        
        //resta
        Calculadora calculadora2 = new Calculadora(2, 3, "-");
        calculadora2.realizarOperacion();
        System.out.println("Suma: "+calculadora2.getResultado());

        //Multiplicación
        Calculadora calculadora3 = new Calculadora(2, 3, "*");
        calculadora3.realizarOperacion();
        System.out.println("Multiplicación: "+calculadora3.getResultado());

        //division
        calculadora = new Calculadora(2, 3, "/");
        calculadora.realizarOperacion();
        System.out.println("Division: "+calculadora.getResultado());

        // En pruebaCalculadora.java
        // Modulo

        @Test
        public void testModulo() {
        Calculadora calc = new Calculadora();
        calc.setNumero1(10);
        calc.setNumero2(3);
        calc.setOperacion("%");
        calc.realizarOperacion();
        assertEquals(1, calc.getResultado(), 0.001);
}

// ...
    }
}
