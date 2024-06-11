import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o saldo da conta: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        scanner.close();
        // Criando o objeto Conta
        Conta conta = new Conta(nomeCliente, agencia, numeroConta, saldo);

        // Exibindo os dados da conta
        System.out.println("--------------------------------------------");
        System.out.println("\u001B[32mDados da Conta:\u001B[0m");
        System.out.println("Cliente: " + conta.nomeCliente());
        System.out.println("Agência: " + conta.agencia());
        System.out.println("Conta: " + conta.numeroConta());
        System.out.println("Saldo: R$ " + conta.saldo());
        System.out.println("--------------------------------------------");
    }
}

record Conta(String nomeCliente, String agencia, int numeroConta, double saldo) {}