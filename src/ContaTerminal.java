import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da agência: ");
            String agencia = scanner.next();

            System.out.println("Agora, digite o número de sua conta: ");
            int numero = scanner.nextInt();

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Para finalizar, digite o valor que será depositado: ");
            double saldo = scanner.nextDouble();

            System.out.println("Muito obgrigado por abrir uma conta em nosso banco " + nome + "! Sua conta é " + numero + " na agência " + agencia + ". Seu saldo atual é de R$" + saldo);
        }
    }
}
