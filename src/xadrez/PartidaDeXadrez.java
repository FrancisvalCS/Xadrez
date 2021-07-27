package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.componentes.Rei;
import xadrez.componentes.Torre;

public class PartidaDeXadrez {

    private Tabuleiro tabuleiro;

    public PartidaDeXadrez(){
        tabuleiro = new Tabuleiro(8,8);
        setupInicial();
    }

    public PecaDeXadrez[][] getPeca(){
        PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i=0; i < tabuleiro.getLinhas(); i++){
            for (int j=0; j<tabuleiro.getColunas(); j++){
                mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i,j);
            }
        }
        return mat;
    }

    //Define a posição inicial das peças ao inicio da partida
    public void setupInicial(){
        tabuleiro.localDaPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
        tabuleiro.localDaPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0,4));
    }
}
