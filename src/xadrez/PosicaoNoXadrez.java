package xadrez;

import tabuleiro.Posicao;

public class PosicaoNoXadrez {

    private int linha;
    private char coluna;

    public PosicaoNoXadrez(char coluna, int linha) {
        if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8){
            throw new XadrezException("Erro ao instanciar PosicaoNoXadrez, valores validos são de a1 à h8!");
        }
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public char getColuna() {
        return coluna;
    }

    protected Posicao paraPosicao(){
        return new Posicao(8 - linha, coluna - 'a');
    }

    protected static PosicaoNoXadrez daPosicao(Posicao posicao){
        return new PosicaoNoXadrez((char)('a'- posicao.getColuna()), 8 - posicao.getLinha());
    }

    @Override
    public String toString(){
        return "" + coluna + linha;
    }
}
