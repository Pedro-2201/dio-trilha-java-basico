import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = leitor.nextLine();
        System.out.print("Digite o número da conta: ");
        int numeroConta = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o número da agência: ");
        String numeroAgencia = leitor.nextLine();
        System.out.print("Digite o saldo da conta: "); //Usar a vírgula para separar os decimais
        float saldoConta = leitor.nextFloat();
        System.out.print(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldoConta));
    }
}