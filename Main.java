import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira os números da sua conta: ");
        String numeros = scanner.nextLine();

        System.out.println("Parabéns esta é sua conta: " + numeros);
    }
}
