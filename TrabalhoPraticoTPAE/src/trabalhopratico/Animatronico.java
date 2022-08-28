package trabalhopratico;

public class Animatronico extends Personagem {
    
    private String maldicao;
    
    public Animatronico (String nome, String descricao, String maldicao){
        super(nome, descricao);
        this.maldicao = maldicao;
    }
    
    public String getMaldicao(){
        return maldicao;
    }
    
    @Override
    public String getDescricao(){
        return super.getDescricao() + "Maldicao: " + getMaldicao();
    }
}

//ANIMATRONICO
//FUNÇÃO: Atrapalhar ao máximo o jogador, lançando maldições 
//MALDIÇÕES: Senhas escritas de trás para frente, perda de duas chances ao errar uma letra da senha, perda da metade das vidas
