package prova2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Frota {
    private Map<Integer, Minicarregadeira> minicarregadeiras;
    private Map<Integer, Acessorio> acessorios;

    public Frota(){
        this.minicarregadeiras = new HashMap<>();
        this.acessorios  = new HashMap<>();
    }

    public int cadastrarMiniCar(double potencia, double capacidade, double peso){
        Minicarregadeira miniCar = new Minicarregadeira(potencia, capacidade, peso);
        this.minicarregadeiras.put(miniCar.getId(), miniCar);

        return miniCar.getId();
    }

    public String exibirMiniCar(int id){
        if (id <= 0)
            throw new IllegalArgumentException("ID não pode ser menor do 1");
        if (this.minicarregadeiras.containsKey(id))
            throw new IllegalArgumentException("Minicarregadora não encontrada!");

        return this.minicarregadeiras.get(id).toString();
    }

    public int cadastraCCes(int dentes) {
        if ( dentes <= 0)
            throw new IllegalArgumentException("Quantidade de dentes invalida!");

        AcessorioCCes acessorio = new AcessorioCCes(dentes);
        this.acessorios.put(acessorio.getId(), acessorio);

        return acessorio.getId();
    }

    public int cadastraCCar(double largura){
        if ( largura <= 0)
            throw new IllegalArgumentException("Largura invalida!");

        AcessorioCCar acessorio = new AcessorioCCar(largura);
        this.acessorios.put(acessorio.getId(), acessorio);

        return acessorio.getId();
    }


    public int cadastraCGal(double larguraCorte){
        if ( larguraCorte <= 0)
            throw new IllegalArgumentException("Largura de corte invalida!");

        AcessorioCCar acessorio = new AcessorioCCar(larguraCorte);
        this.acessorios.put(acessorio.getId(), acessorio);

        return acessorio.getId();
    }

    public void setAcessorio( int iDMiniCar, int iDAcessorio ){
        if (iDMiniCar <= 0)
            throw new IllegalArgumentException("id do MiniCar invalido!");
        if (iDAcessorio <= 0)
            throw new  IllegalArgumentException("id do Acessorio invalido!");
        if ( !this.acessorios.containsKey(iDAcessorio) || !this.minicarregadeiras.containsKey(iDMiniCar) )
            throw new IllegalArgumentException("algum objeto nao encontrado!");

        this.minicarregadeiras.get(iDMiniCar).setAcessorio(this.acessorios.get(iDMiniCar));
    }


    String consultar(String aplicacao){
        ArrayList<Minicarregadeira> lista = new ArrayList<>(this.minicarregadeiras.values());
        Collections.sort(lista);
        String r = "";

        for (Minicarregadeira m: lista){
            if (m.getAplicacao().equals(aplicacao))
                r += m.toString() + " | ";
        }

        return r;
    }

}
