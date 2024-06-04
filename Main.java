public class Main {
    public static void main(String[] args) {

        System.out.println("   PERMUTACIONES    ");
        Permutaciones.generarPermutaciones(DataSet.dataLetras);

        ProbabilidadMarginal.imprimirProbabilidadesMarginales();

        ProbabilidadConjunta.imprimirProbabilidadesConjuntas();

        ProbabilidadCondicional.imprimirProbabilidadesCondicionales();
    }
}
