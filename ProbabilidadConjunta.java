public class ProbabilidadConjunta {

    public ProbabilidadConjunta() {
    }

    public static void imprimirProbabilidadesConjuntas() {
        double totalAB = ProbabilidadMarginal.totalAB();

        System.out.println("   PROBABILIDADES CONJUNTAS   ");
        System.out.println("Probabilidad Conjunta de A1 y B1: " + (DataSet.dataNumbers[0][0] / totalAB) * 100.0 + "%");
        System.out.println("Probabilidad Conjunta de A2 y B2: " + (DataSet.dataNumbers[1][1] / totalAB) * 100.0 + "%");
    }
}

