package trabalhopratico;
import java.util.Random;

public class Android extends Personagem {
    
    private String caixaMisteriosa;
    private String maldicao;
    private String presente;
    
    public Android (String nome, String descricao, String caixaMisteriosa, String maldicao, String presente){
        super(nome, descricao);
        this.caixaMisteriosa = caixaMisteriosa;
    }    
    
    public String getMaldicao(){
        return maldicao;
    }
    
    public String getPresente(){
        return presente;
    }
    
    public String getCaixaMisteriosa(){
        Random gerarCaixa = new Random(); //classe Random
        int caixa = gerarCaixa.nextInt(2); //o método nextInt gera um numero inteiro aleatório (0 ou 1)
        
        if (caixa == 0)
            caixaMisteriosa = getMaldicao();
        else
            caixaMisteriosa = getPresente();
        return caixaMisteriosa;
    }
    
    @Override
    public String getDescricao(){
        return super.getDescricao() + "Caixa Misteriosa: " + getCaixaMisteriosa();
    }    
}

//ANDROID
//FUNÇÃO: Entregar uma caixa misteriosa para o jogador
//CAIXA MISTERIOSA: Maldição do ANIMATRONICO ou presente do MORDOMO ROBO

