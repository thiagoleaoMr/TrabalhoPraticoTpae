package trabalhopratico;
import java.util.ArrayList;
import java.util.Random;

public class Senha {
    private ArrayList<String> listaSenhas;
    
    public Senha(){
        listaSenhas = new ArrayList<String>();
    }
    
    public void adicionarSenhas(String s){
        listaSenhas.add(s);
    }
    
    public String gerarNovaSenha(){
        Random aleatorio = new Random(); //classe Random
        int numAleatorio = aleatorio.nextInt(listaSenhas.size() - 1); // o método nextInt gera um numero inteiro aleatório(-1 é tirando o 0)
        return listaSenhas.get(numAleatorio); // retorna uma senha na posição do numero aleatório gerado
    }
}
