package application;

import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.PosicaoNoXadrez;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        PartidaDeXadrez partida = new PartidaDeXadrez();
        
        while(true){
            UI.mostraTabuleiro(partida.getPeca());
            System.out.println();
            System.out.print("Origem: ");
            PosicaoNoXadrez origem = UI.lerPosicaoNoXadrez(sc);

            System.out.println();
            System.out.print("Destino: ");
            PosicaoNoXadrez destino = UI.lerPosicaoNoXadrez(sc);

            PecaDeXadrez pecaCapturada = partida.executarPosicaoDeXadrez(origem, destino);
        }



    }
}
