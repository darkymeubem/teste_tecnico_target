package teste4;

public class Dominio {
    public double soma(double [] vet){
        double sum = 0;
        for (double v : vet) {
            sum += v;
        }
        return sum;
    }
}
