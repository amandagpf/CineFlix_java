package desafio_final_banco.src;

import java.util.Scanner;

public class Cliente extends Conta {

    public static void main(String[] args) {

        int resposta = 0;

        Conta cliente1 = new Cliente();

        cliente1.setNome("Amanda Fernandes");
        cliente1.setTipoConta("Conta Corrente");
        cliente1.setSaldo(2500.00);

        cliente1.mostraDados();

        Scanner leitura = new Scanner(System.in);

        while (resposta != 4){
            mostraMenu();
            resposta = leitura.nextInt();

            if (resposta == 1){
                System.out.println("O saldo atual é: " + cliente1.getSaldo());
            } else if (resposta == 2) {

                System.out.println("Digite o valor que deseja receber: ");
                double valor = leitura.nextDouble();
                cliente1.recebe(valor);

            } else if (resposta == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                cliente1.transfere(valor);
            }else if (resposta > 4 || resposta < 0){
                System.out.println("Número inválido, tente novamente.");
            }
        }

    }


}
