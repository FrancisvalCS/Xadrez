package tabuleiro;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas){
        if(linhas < 1 || colunas < 1){
            throw new TabuleiroException("Erro ao criar tabuleiro, a quantidade de linhas e colunas devem ser superiores a 1!");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peca peca(int linha, int coluna){
        if(!posicaoExiste(linha, coluna)){
            throw new TabuleiroException("Não existe esta posição no tabuleiro!");
        }
        return pecas[linha][coluna];
    }
    //Sobrecarga do método peca
    public Peca peca(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new TabuleiroException("Não existe esta posição no tabuleiro!");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    //Colocar uma peça em determinada posição
    public void localDaPeca(Peca peca, Posicao posicao){
        //Verificar se já existe peça na posição selecionada
        if(possuiPeca(posicao)){
            throw new TabuleiroException("Já existe uma peça na posição: "+posicao);
        }
        //Caso não...
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    public Peca removePeca(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new TabuleiroException("Essa posição não existe no tabuleiro!");
        }
        if(peca(posicao) == null){
            return null;
        }
        Peca aux = peca(posicao);
        aux.posicao = null;
        pecas[posicao.getLinha()][posicao.getColuna()] = null;
        return aux;
    }

    //Verificar se uma posição existe
    private boolean posicaoExiste(int linha, int coluna){
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }
    private boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinha(), posicao.getColuna());
    }

    //Verificar se existe uma peça
    public boolean possuiPeca(Posicao posicao){
        //Verifica primeiro se a posição existe no tabuleiro
        if(!posicaoExiste(posicao)){
            throw new TabuleiroException("Não existe esta posição no tabuleiro!");
        }
        return peca(posicao) != null;
    }
}
