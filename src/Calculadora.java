import java.util.Scanner;

public class Calculadora {

    public int dobrarNumeroDigitado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        return numero * 2;
    }
}
