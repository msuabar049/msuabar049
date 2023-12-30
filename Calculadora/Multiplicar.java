public class Multiplicar {
    private int num1;
    private int num2;
    private double resultado;

    public Multiplicar(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        calcular();
    }

    public double getResultado() {
        return resultado;
    }

    private void calcular(){
        this.resultado = num1*num2;
    }
}
