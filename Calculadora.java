/*
 * This is a class that performs basic operations.
 * @param numero1 The first number of the operation.
 * @param numero2 The second number of the operation.
 * @param operacion The operation to be performed.
 * @return The result of the operation.
 * @see Calculadora
 * @msuabar049
 */
public class Calculadora {
    private int numero1;
    private int numero2;
    private double resultado;
    private String operacion;
    
    /* 
     * This is the constructor of the class.
     * @param numero1 The first number of the operation.
     * @param numero2 The second number of the operation.
     * @param operacion The operation to be performed.
     * @see Calculadora
     * @msuabar049
    */
    public Calculadora(int numero1, int numero2, String operacion) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacion = operacion;
    }

    public void realizarOperacion() {
        switch (operacion) {
            case "+":
                suma();
                break;
            default:
                System.out.println("Operación no válida");
        }
    }

    private void suma() {
        resultado = numero1 + numero2;
    }
    
    public double getResultado() {
        return resultado;
    }
}
