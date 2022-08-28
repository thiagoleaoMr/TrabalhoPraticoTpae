package trabalhopratico;

public class Guardiao extends Personagem {
    
    private String desafio;
    
    public Guardiao (String nome, String descricao, String desafio){
        super(nome, descricao);    
        this.desafio = desafio;
    }
    
    public String getDesafio(){
        return desafio;
    }
    
    @Override
    public String getDescricao(){
        return super.getDescricao() + "Desafio: " + getDesafio();
    }
}

//GUARDIAO
//FUNÇÃO: Proteger o portal através de um desafio
//* O GUARDIAO aparece apenas no cômodo onde se encontra o PORTAL
//* O jogador tem apenas 3 chances para superar o GUARDIAO, e só vence o jogo se derrotá-lo

