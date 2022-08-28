package trabalhopratico;

public abstract class Personagem {
    private String nome;
    private String descricao;

    public Personagem(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Personagem:" + nome + descricao;
    }
}