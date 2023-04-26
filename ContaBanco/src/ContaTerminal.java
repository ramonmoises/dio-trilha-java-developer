import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
        
        Scanner entradaAgencia = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        String Agencia = entradaAgencia.nextLine();

        Scanner entradaNumero = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta!");
        int Numero = Integer.parseInt(entradaNumero.nextLine());

        Scanner entradaNomeCliente = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome!");
        String NomeCliente = entradaNomeCliente.nextLine();

        Scanner entradaSaldo = new Scanner(System.in);
        System.out.println("Por favor, digite o saldo da conta!");
        Double Saldo = Double.parseDouble(entradaSaldo.nextLine());

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo R$067-8" + Saldo + " já está disponível para saque." );

        

    }
}
