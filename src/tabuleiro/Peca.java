package tabuleiro;

public class Peca {

    //atributo "posicao" como protected para não ser visualizado pela camada de xadrez
    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
        posicao = null; //Por padrão esse valor ja seria nulo, colocá-lo é opcional
    }

    //Apenas para uso interno na camada de tabuleiro
    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
