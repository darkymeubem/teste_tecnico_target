package teste4;

public class teste4 {
    static String vet[] = {"SP", "RJ", "MG", "ES", "OUTROS"};
    static double vect[] = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

    public static void main(String[] args) {
        Dominio dom = new Dominio();
        double total = dom.soma(vect);
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Porcentagem de %s dentro do faturamento mensal foi de %.2f", vet[i], (vect[i]/total) * 100);
            System.out.print("%\n");
        }

    }
}
