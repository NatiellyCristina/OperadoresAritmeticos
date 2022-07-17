package operacoes.aritmeticas;

public class Quadrilatero {

    //Sobrecarga: Capacidade de definir métodos para diferentes contextos, mas preservando seu nome,
    // mudando a assinatura.

    public static void area(double lado) {
        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio:" + ((baseMaior + baseMenor) * altura) / 2);
    }

// Erro de compilação pois já existe um método que recebe dois parâmetros do tipo double
//    public static void area(double diagonal1, double diagonal2) {
//        System.out.println("Área do losango:" + (diagonal1 * diagonal2) / 2);
//    }

}
