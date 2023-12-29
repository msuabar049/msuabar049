public class Calculadora {
    private int numero1;
    private int numero2;
    private double resultado;
    private String operacion;
    
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
            case "-":
                resta();
                break;
            default:
                System.out.println("Operación no válida");
        }
    }

    private void suma() {
        resultado = numero1 + numero2;
    }

    private void resta() {
        resultado = numero1 - numero2;
    }
    
    public double getResultado() {
        return resultado;
    }
}
