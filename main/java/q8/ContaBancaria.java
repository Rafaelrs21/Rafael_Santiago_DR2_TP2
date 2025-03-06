package q8;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public  void comprar(double valor) {
        this.saldo -= valor;
    }

    public boolean podeComprar(double valor) {
        if (saldo >= valor) {
            comprar(valor);
            return true;
        }
        return false;
    }
}
