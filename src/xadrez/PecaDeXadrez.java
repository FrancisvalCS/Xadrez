package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

/*
* Esta classe é uma subclasse da classe Peca, portanto, deve herdar seus atributos
* e métodos
* */
public class PecaDeXadrez extends Peca {

    private Cor cor;

    public PecaDeXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

}
