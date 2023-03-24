package br.com.icm;

public class Operadores {
    public static void main(String args[]){
        operacoesAritimeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
    }

    private static void operacoesRelacionais() {
        System.out.println("operacoes Relacionais");
        int numero1 = 11;
        int numero2 = 10;
        boolean isMaior = numero1 > numero2;
        System.out.println("isMaior:" + isMaior);

        boolean isIgual = numero1 == numero2;
        System.out.println("isIgual:" + isIgual);

        boolean isDiferente = numero1 != numero2;
        System.out.println("isDiferente:" + isDiferente);

        boolean isMaiorIgual = numero1 >= numero2;
        System.out.println("isMaiorIgual:" + isMaiorIgual);

        boolean isDentroE = numero1 >= 0 && numero1<=10;
        System.out.println("isDentro Operador &&:" + isDentroE);

        boolean isDentroOR = numero1 >= 0 || numero1<=10;
        System.out.println("isDentro Operador ||:" + isDentroOR);

        boolean isNOT = numero1 >= 1;
        System.out.println("isNOT:" + isNOT);
    }

    public static void operacoesIncrementoDecremento(){
        System.out.println("operacoesIncrementoDecremento");
        int numero1 = 10;
        int numero2 = 20;


        System.out.println("incremento");
        System.out.println(numero1);
        numero1++;
        System.out.println(numero1);

        System.out.println("Decremento");
        System.out.println(numero2);
        numero2--;
        System.out.println(numero2);

    }

    private static void operacoesAtribuicoes() {
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println("operacoes de Atribuicoes");

        System.out.println(numero3);
        numero3 += numero3;

        System.out.println(numero3);
    }

    public static void operacoesAritimeticas(){
        int num1 = 40;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (num1 + num2) * 2;
        System.out.println("operacoes Aritimeticas");

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}
