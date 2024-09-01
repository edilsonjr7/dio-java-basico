import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler os dados inseridos pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Solicita e lê a agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        // Limpa o buffer para a próxima leitura de texto
        scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Cria a mensagem final utilizando concatenação de strings
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                          + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibe a mensagem
        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}
