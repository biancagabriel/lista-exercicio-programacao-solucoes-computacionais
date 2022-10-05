import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, area;

        System.out.println("Digite o raio da circunferencia: ");
        raio = new Scanner(System.in).nextFloat();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A area da circunferencia eh de: %.2f", area);
    }
}
