package padroescomportamentais.strategy;

public class Contador {

    private float conta;

    public float getConta() {
        return conta;
    }

    public void somarConta(float conta1, float conta2) {
        Calculadora calculadora = new Calculadora(conta1, conta2);
        this.conta = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairConta(float conta1, float conta2) {
        Calculadora calculadora = new Calculadora(conta1, conta2);
        this.conta = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirConta(float conta1, float conta2) {
        Calculadora calculadora = new Calculadora(conta1, conta2);
        this.conta = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarConta(float conta1, float conta2) {
        Calculadora calculadora = new Calculadora(conta1, conta2);
        this.conta = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaContas(float conta1, float conta2) {
        Calculadora calculadora = new Calculadora(conta1, conta2);
        this.conta = calculadora.calcular(new OperacaoMedia());
    }

}
