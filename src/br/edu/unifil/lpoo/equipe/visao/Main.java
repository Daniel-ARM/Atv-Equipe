package br.edu.unifil.lpoo.equipe.visao;

import br.edu.unifil.lpoo.equipe.modelo.Equipe;
import br.edu.unifil.lpoo.equipe.modelo.Jogador;

public class Main {

    public static void main(String[] args) {
        Jogador jog1 = new Jogador("Dagoberto", "Atacante");
        Jogador jog2 = new Jogador("Umberto", "Defesa");
        Jogador jog3 = new Jogador("Doisberto", "Zagueiro");

        Equipe equipe1 = new Equipe("LiBertoDores");
        Equipe equipe2 = new Equipe("Barselones");

        equipe1.addJogador(jog1);
        equipe1.addJogador(jog2);
        equipe2.addJogador(jog3);

        System.out.println("Equipe 1: " + equipe1.listarJogadores());
        System.out.println("Equipe 2: " + equipe2.listarJogadores());
        System.out.println(equipe1.getJogador("Dagoberto").getNome());
        System.out.println(equipe1.getJogador("Zeroberto").getNome());
    }
}
