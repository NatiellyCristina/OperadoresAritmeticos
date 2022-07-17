package operacoes.aritmeticas;

public class Emprestimo {

    public static void calcular(double valor, double parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxasDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxasTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantiddade de parcelas não aceitas.");
        }
    }
    public static double getTaxasDuasParcelas(){
        return 0.3;
    }


    public static double getTaxasTresParcelas() {
        return 0.45;
    }


}
