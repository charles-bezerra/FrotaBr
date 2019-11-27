package prova2;

public class Minicarregadeira implements Comparable<Minicarregadeira>{
    private int id;
    private double potencia;
    private double capacidade;
    private double peso;
    private String aplicacao;
    private static int contador = 1;

    private Acessorio acessorio;

    public Minicarregadeira(double potencia, double capacidade, double peso){
        this.id = contador;
        this.potencia = verificaDouble(potencia, "Potencia");
        this.capacidade = verificaDouble(capacidade, "Capacidade");
        this.peso = verificaDouble(peso, "Peso");;
        this.aplicacao = "geral";

        contador++;
    }

    public int getId(){
        return this.id;
    }

    public String getAplicacao(){
        return aplicacao;
    }

    public double verificaDouble(double valor, String param){
        if (valor <= 0) {
            throw new IllegalArgumentException(param + " não pode ser igual ou menor a zero!");
        }
        return valor;
    }


    public void setAcessorio(Acessorio acessorio){
        this.acessorio = acessorio;
        this.aplicacao = acessorio.getAplicacao();
    }


    @Override
    public String toString(){
        return "(" + id + ", " + potencia + ", " + ", " + (capacidade + acessorio.getCapacidade()) + ", " + (peso + acessorio.getPeso()) + ", " + aplicacao + ")";
    }

    @Override
    public int compareTo(Minicarregadeira minicarregadeira){
        return this.toString().compareTo(minicarregadeira.toString());
    }

}
