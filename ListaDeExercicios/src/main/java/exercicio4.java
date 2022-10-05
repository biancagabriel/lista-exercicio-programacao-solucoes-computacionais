import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1,nota2,nota3,nota4, notab1, notab2,media;

        System.out.println("digite a primeira nota");
        nota1 = entrada.nextDouble();

        System.out.println("digite a segunda nota:");
        nota2 = entrada.nextDouble();

        System.out.println("digite a terceira nota:");
        nota3 = entrada.nextDouble();

        System.out.println("digite a quarta nota:");
        nota4 = entrada.nextDouble();

        notab1 = (nota1 + nota2)/2;
        notab2 = (nota3 + nota4)/2;

        media = (notab1 + notab2)/2;

        System.out.println(" a nota do primeiro bimestre é: " +notab1);
        System.out.println(" a nota do segundo bimestre é: " +notab2);
        System.out.println("a média é: " +media);

    }
}
