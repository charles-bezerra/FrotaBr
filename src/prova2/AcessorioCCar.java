package prova2;

public class AcessorioCCar extends Acessorio {
    private double largura;

    public AcessorioCCar(double largura){
        super(largura*200, largura/0.0004, "agricultura");
        this.largura = largura;
    }
}
