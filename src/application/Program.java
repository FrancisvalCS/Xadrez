package application;

import Xadrez.PartidaDeXadrez;
import tabuleiro.Tabuleiro;

public class Program {

    public static void main(String[] args){
        PartidaDeXadrez partida = new PartidaDeXadrez();
        UI.mostraTabuleiro(partida.getPeca());
    }
}
