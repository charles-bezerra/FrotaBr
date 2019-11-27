package prova2;

public class Facade {
    private Frota frota;

    public Facade(){
        this.frota = new Frota();
    }

    public int cadastrarMiniCar(double potencia, double capacidade, double peso){
        return frota.cadastrarMiniCar(potencia, capacidade, peso);
    }

    public String exibirMiniCar(int id){
        return frota.exibirMiniCar(id);
    }

    public int cadastraCCes(int dentes) {
        return frota.cadastraCCes(dentes);
    }

    public int cadastraCCar(double largura){
        return frota.cadastraCCar(largura);
    }


    public int cadastraCGal(double larguraCorte){
        return frota.cadastraCGal(larguraCorte);
    }

    public void setAcessorio( int iDMiniCar, int iDAcessorio ){
        frota.setAcessorio(iDMiniCar, iDAcessorio);
    }

    String consultar(String aplicacao){
        return frota.consultar(aplicacao);
    }

}
