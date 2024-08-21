import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int numero = 0;
        String agencia = new String();
        String nomeCliente = new String();
        double saldo = 0;

        System.out.println("entre com o seu nome por favor: ");
        nomeCliente = tec.nextLine();
        System.out.println("entre com o numero da sua conta por favor: ");
        numero = tec.nextInt();
        tec.nextLine();
        System.out.println("entre com o numero da sua agencia por favor: ");
        agencia = tec.nextLine();
        System.out.println("entre com o saldo por favor: ");
        saldo = tec.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo : " + saldo + " já está disponível para saque");




    }
}