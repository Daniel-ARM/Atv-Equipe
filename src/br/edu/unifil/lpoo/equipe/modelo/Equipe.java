package br.edu.unifil.lpoo.equipe.modelo;

import java.util.ArrayList;

public class Equipe {

    private String nomeEquipe;
    private ArrayList<Jogador> jogadores;

    public Equipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
        this.jogadores = new ArrayList<>();
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public void addJogador(Jogador jog){
        this.jogadores.add(jog);
    }

    public void removeJogador(Jogador jog){
        this.jogadores.remove(jog);
    }

    public String listarJogadores(){
        String saida = "";
        for (Jogador jogador : this.jogadores){
            saida = saida + jogador.getNome() + '\n';
        }
        return saida;
    }

    public Jogador getJogador(String nome) throws IllegalArgumentException {
        for (Jogador jogador : this.jogadores){
            if (jogador.getNome().equals(nome)){
                return jogador;
            }
        }
        throw new IllegalArgumentException("Jogador inexistente");
    }
}
