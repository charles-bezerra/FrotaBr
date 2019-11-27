package prova2;

public class Acessorio {
    private static int contador = 1;

    private int id;
    private double capacidade, peso;
    private String aplicacao;

    public Acessorio(double peso, double capacidade, String aplicacao){
        this.id = contador;
        this.peso = peso;
        this.capacidade = capacidade;
        this.aplicacao = aplicacao;

        contador++;
    }

    public int getId(){
        return id;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getCapacidade(){
        return this.capacidade;
    }

    public String getAplicacao(){
        return this.aplicacao;
    }
}
