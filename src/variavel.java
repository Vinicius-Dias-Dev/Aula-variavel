import java.util.Scanner;

public class variavel {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo");
        String nome = scanner.nextLine();

        System.out.println("Digite seu estado civil Ex: Solteiro, Casado ou Viuvo.");
        String EstadoCivil = scanner.nextLine();

        System.out.println("agora digite sua idade");
        int idade = scanner.nextInt();

        String pegarVazio = scanner.nextLine();

        System.out.println("digite seu CPF");
        String cpf = scanner.nextLine();

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Seu nome completo é " + nome + ", e seu estado civil é " + EstadoCivil + ", sua idade é " + idade + ", seu CPF " + cpf + " e o seu peso é " + peso + ".. Se as informações estiverem corretas digite True para Estão Corretas e false para Estão Erradas ");
        boolean CertoOuErrado = scanner.nextBoolean();

        System.out.println("Obrigado por se cadastrar, se as informações estiverem erradas, voce sera redirecionado para corrigilas."); // na verdade nao vai, mas oque importa é a experiencia..
        scanner.close();
    }
}
