import java.util.Scanner;

public class Conta {

    String nome;
    static double saldo;
    String tipoConta;

    public void mostraDados(){
        System.out.println("************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n************************************");
    }

    public static void mostraMenu(){

        System.out.println("\nOperações");
        System.out.println("""
                \n1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair                
                """);
        System.out.println("\nDigite o número correspondente a opção que deseja: ");
    }

    public void recebe(double valor){
        saldo += valor;
    }

    public boolean transfere(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("Saldo insuficuente.");
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }
}