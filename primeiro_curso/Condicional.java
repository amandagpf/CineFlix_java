public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2001;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 0.8;
        String tipoPlano = "premium";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os cliente estão curtindo.");
        } else {
            System.out.println("Filme retrô que vale a pena assistir.");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("premium")) {
            System.out.println("Filme liberato");
        } else {
            System.out.println("Deve pagar a locação.");
        }
    }
}
