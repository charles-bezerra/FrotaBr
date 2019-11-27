package prova2;

public class AcessorioCCes extends Acessorio {
    private int dentes;

    AcessorioCCes(int dentes){
        super(dentes*15, dentes*10, "construção");
        this.dentes = dentes;
    }
}
