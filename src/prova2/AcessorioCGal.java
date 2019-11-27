package prova2;

public class AcessorioCGal extends Acessorio {
    private double larguraCorte;
    public AcessorioCGal(double larguraCorte){
        super(larguraCorte*50, 0,"paisagismo");
        this.larguraCorte = larguraCorte;
    }
}
