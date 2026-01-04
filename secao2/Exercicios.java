
public class Exercicios {

    public static void main(String[] args) {
        //Exercicio 1

        int num1 = 10;
        int num2 = num1*2;

        System.out.println("O primeiro numero é: " + num1 + " O dobro do primeiro numero é: " + num2);

        //Exercicio 2

        char letra = 'B';
        int valorAscii =  (int) letra;

        System.out.println("O numero referente a Letra: " + letra + " em Ascii é " + valorAscii);


        //Exercicio 3

        double valor1 = 15.75;
        double valor2 = 20.40;
        double valor3 = valor1 + valor2;

        System.out.println("A soma de " + valor1 + " + " + valor2 + " é " + valor3);


        //Eercicio 4

        long numeroGrande = 2_000_000_000L;

        int numeroInt = (int) numeroGrande;

        System.out.println(numeroInt);


        //Exercicio 5

        String saudacao = "Olá Mundo! ";
        String mensagem = saudacao + " Bem Vindo ao Java! ";

        System.out.println(mensagem);
    }
}
