import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double lado1,lado2, area, areaDobro;

        System.out.println("digite o valor do primeiro lado:");
        lado1 = entrada.nextDouble();
        System.out.println("digite o valor do segundo lado:");
        lado2 = entrada.nextDouble();

        area = lado1*lado2;
        areaDobro = Math.pow(area,2);

        System.out.println(" a area ao quadrado é: " + areaDobro);
    }
}
