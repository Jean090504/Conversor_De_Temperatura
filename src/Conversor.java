import java.util.Scanner;

public class Conversor {

    private double celsius;
    private double fahrenheit;
    private double kelvin;
    private double resultadoFahrenheit;
    private double resultadoKelvin;


    public void entradaDados(){
        Scanner scDouble = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = scDouble.nextDouble();


        calculoConversao();
    }

    private void calculoConversao(){
    /* C > F = C x 1,8 + 32
       C > K = C + 273,15
     */
         resultadoFahrenheit = celsius * 1.8 + 32;
         resultadoKelvin = celsius + 273.15;


        saidaDados();
    }

    private void saidaDados(){
        System.out.println("*********CONVERSOR**DE**TEMPERATURA*********");
        System.out.println(celsius +"Cº equivalem a:");
        System.out.println("Resultado em Fahrenheit: "+ resultadoFahrenheit + "Fº");
        System.out.println("Resultado em Kelvin: " + resultadoKelvin + "Kº");
        System.out.println("********************************************");

    }
}
