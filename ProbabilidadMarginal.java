public class ProbabilidadMarginal {


    public static double totalAB() {
        double total = DataSet.dataNumbers[0][0] + DataSet.dataNumbers[0][1] + DataSet.dataNumbers[1][0] + DataSet.dataNumbers[1][1];
        return total;
    }

    public static double totalA1() {
        double total = DataSet.dataNumbers[0][0] + DataSet.dataNumbers[1][0];
        return total;
    }

    public static double totalA2() {
        double total = DataSet.dataNumbers[0][0] + DataSet.dataNumbers[0][1];
        return total;
    }

    public static double totalB1() {
        double total = DataSet.dataNumbers[0][1] + DataSet.dataNumbers[1][1];
        return total;
    }

    public static double totalB2() {
        double total = DataSet.dataNumbers[1][0] + DataSet.dataNumbers[1][1];
        return total;
    }

    public static void imprimirProbabilidadesMarginales() {
        double totalAB = totalAB();
        double totalA1 = totalA1();
        double totalA2 = totalA2();
        double totalB1 = totalB1();
        double totalB2 = totalB2();

        System.out.println("   PROBABILIDADES MARGINALES    ");
        System.out.println("Probabilidad Marginal de A1: " + (totalA1 / totalAB) * 100.0 + "%");
        System.out.println("Probabilidad Marginal de A2: " + (totalA2 / totalAB) * 100.0 + "%");
        System.out.println("Probabilidad Marginal de B1: " + (totalB1 / totalAB) * 100.0 + "%");
        System.out.println("Probabilidad Marginal de B2: " + (totalB2 / totalAB) * 100.0 + "%");
    }
}
