
import java.util.Scanner;

public class ContaTermional {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo ao banco MaduLinda!, digite seus dados para consulta.");

        double saldo = 237.48;
        System.out.println("Por favor, insira o número da sua agência: ");
        String agency = entrada.nextLine();

        System.out.println("Por favor, insira o número da sua conta: ");
        String conta = entrada.nextLine();

        System.out.println("Agora por favor insira seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Olá! "+ nome +" ,obrigado por criar uma conta no nosso banco!");
        System.out.println("Sua agência é: "+ agency + " conta " + conta + " e seu saldo " +saldo + " já está disponível!");

    }
}
