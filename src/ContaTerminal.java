import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Instancando a classe ContaBanco
        ContaBanco conta = new ContaBanco();

        //Dados a serem inseridos
        System.out.println("Por Favor, digite o número da Agência !");
        conta.agencia = scanner.next();

        System.out.println("Por Favor, digite o número da conta !");
        conta.numeroConta = scanner.nextInt();

        System.out.println("Por Favor, digite o seu nome !");
        conta.nomeCliente = scanner.next();

        System.out.println("Por Favor,digite o seu sobrenome !");
        conta.sobrenomeCliente = scanner.next();

        System.out.println("Por Favor, digite o valor inicial a ser depositado!");
        conta.saldo =  scanner.nextDouble();

        //Mensagem a ser exibida concatenado os dados inseridos
        System.out.println("Olá " + conta.nomeCliente + " " + conta.sobrenomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numeroConta + " e seu saldo de R$ " + conta.saldo + " já está disponível para saque." );  
        scanner.close(); 

    }
}
