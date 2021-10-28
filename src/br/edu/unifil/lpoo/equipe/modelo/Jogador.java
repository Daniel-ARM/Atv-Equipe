package br.edu.unifil.lpoo.equipe.modelo;

public class Jogador {

    private String nome;
    private String posicao;

    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) throw new NullArgumentException("Nulo");
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        if (posicao == null) throw new NullArgumentException("Nulo");
        this.posicao = posicao;
    }
}
