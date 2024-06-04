public class ProbabilidadCondicional {

    public ProbabilidadCondicional() {
    }

    public static void imprimirProbabilidadesCondicionales() {
        double totalA1 = ProbabilidadMarginal.totalA1();
        double totalB2 = ProbabilidadMarginal.totalB2();

        System.out.println("   PROBABILIDADES CONDICIONALES    ");
        System.out.println("Probabilidad Condicional de A1 dado B1: " + (DataSet.dataNumbers[0][0] / totalA1) * 100.0 + "%");
        System.out.println("Probabilidad Condicional de A2 dado B2: " + (DataSet.dataNumbers[1][1] / totalB2) * 100.0 + "%");
    }
}

