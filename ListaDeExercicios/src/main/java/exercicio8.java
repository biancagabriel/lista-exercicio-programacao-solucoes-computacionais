import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int hora;
        double valorHora, total;

        System.out.println("digite a quantidade de horas trabalhadas:");
        hora = entrada.nextInt();
        System.out.println("digite o valor da hora:");
        valorHora = entrada.nextDouble();

        total= valorHora * hora;

        System.out.println("o valor do salario: R$"+total);

    }
}
