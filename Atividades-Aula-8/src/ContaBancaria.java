public class ContaBancaria {

    int numeroDaConta;
    double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(int numConta, double saldoConta) {
        setNumeroDaConta(numConta);
        setSaldo(saldoConta);
    }
}
