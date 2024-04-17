public class ContaBancaria {

    protected double saldo;
    private double saque;

    public void depositar(double valor){

        this.saldo += valor;
    }

    public void sacar(double valorSaque){
        if (valorSaque <= saldo){
            saldo -= valorSaque;
            System.out.println("Valor do saque de: R$ " + valorSaque + " efetuado com sucesso!");
        } else {
            System.out.println("Valor insuficiente para efetuar o saque.");
        }
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual é: " + this.saldo);
    }

    public static void main(String[] args) {
        ContaCorrente cb = new ContaCorrente();

        cb.depositar(1000);
        cb.consultarSaldo();

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(700);
        cc.cobrarTarifaMensal();
        cc.consultarSaldo();
        cc.sacar(300);
        cc.consultarSaldo();
    }


}
