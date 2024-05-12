import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia =scan.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int conta = scan.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scan.nextDouble();
        
        scan.close();
             
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");      
    }
}