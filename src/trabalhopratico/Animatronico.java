package trabalhopratico;
import java.util.Random;

public class Animatronico extends Personagem {
    
    private String maldicao[];

    public Animatronico(String maldicao[], String nome, String descricao) {
        super(nome, descricao);
        maldicao = new String [2]; //Vetor da maldicao
    }

    public String[] getMaldicao() {
        return maldicao;
    }

    public void setMaldicao(String[] maldicao) {
        ////criar métodos para cada maldição!!!!!!!!
        this.maldicao[0] = "Senha de trás para frente"; 
        this.maldicao[1] = "Se errar uma letra, perde duas chances";
        this.maldicao[2] = "Perde metade das vidas";
    }
    
    public int qualMaldicao(){ //Definir qual será a maldição, de maneira aleatória
        Random gerarMaldicao = new Random(); //Classe Random
        int num = gerarMaldicao.nextInt(2);//O método nextInt gera um numero inteiro aleatório (0, 1 ou 2)
        
        return num;
        //return maldicao[num]; //Retorna a maldição referente ao numero aleatório gerado
    }
    
    @Override
    public String getDescricao(){
        return super.getDescricao() + "Maldicao: " + getMaldicao();
    }
}

//ANIMATRONICO
//FUNÇÃO: Atrapalhar ao máximo o jogador, lançando maldições 
//MALDIÇÕES: Senhas escritas de trás para frente, perda de duas chances ao errar uma letra da senha, perda da metade das vidas
