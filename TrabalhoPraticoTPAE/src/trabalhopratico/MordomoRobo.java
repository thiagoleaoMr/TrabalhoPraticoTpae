package trabalhopratico;

public class MordomoRobo extends Personagem {
    
    private String presente;
    
    public MordomoRobo (String nome, String descricao, String presente){
        super(nome, descricao);
        this.presente = presente;
    }    
    
    public String getPresente(){
        return presente;
    }
    
    @Override
    public String getDescricao(){
        return super.getDescricao() + "Presente: " + getPresente();
    }
}

//MORDOMO-ROBO
//FUNÇÃO: Auxiliar o jogador com presentes
//PRESENTES: Vida extra, remoção de maldições (do Animatrônico), itens expeciais para auxiliar na busca pelo portal