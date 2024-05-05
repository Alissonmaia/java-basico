//importar as Classes Scanner e Locale
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        System.out.println("Bem-vindo ao Santander\n");
        System.out.println("Criar Conta");
        //Criação do objeto scanner 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);//Receber valores decimais modelo bancário US
        //Interação de entrada do usuário
        System.out.println("\nPor favor, digite seu nome Completo: ");
        String nomeCliente = scanner.nextLine();
        //Interação de entrada do usuário
        System.out.println("\nPor favor, digite o número da sua agência: ");
        String agencia = scanner.next();
        //Interação de entrada do usuário
        System.out.println("\nPor favor, digite Número da Conta: ");
        int numero = scanner.nextInt(); //Converter para inteiro
        //Interação de entrada do usuário
        System.out.println("\nPor favor, faça seu primeiro depósito! ");
        double saldo = scanner.nextDouble();//Tipo convenção bancária US converter para double
        //Imprimir a concatenação 
        System.out.println("\nOlá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " 
        + numero 
        + " e seu saldo " 
        + saldo + " já está disponível para saque.");
    }
}//fim
