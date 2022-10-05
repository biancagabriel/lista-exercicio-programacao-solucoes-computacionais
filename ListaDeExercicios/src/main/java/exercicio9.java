import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double tempFahrenheit, tempCelsius;


        System.out.print(" Digite a temperatura em Fahrenheit:");
        tempFahrenheit = entrada.nextDouble();

        tempCelsius = 5 * ( tempFahrenheit -32) / 9;

        System.out.print(" A temperatura é " + tempCelsius + "ºc");
    }
}
