import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.println("digite o primeiro número:");
        numero1 = entrada.nextInt();
        System.out.println("digite o segundo número:");
        numero2 = entrada.nextInt();;

        soma = numero1+numero2;

        System.out.println("o resultado da soma é: " +soma);
    }
}
