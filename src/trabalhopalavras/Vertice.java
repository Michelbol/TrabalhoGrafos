/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopalavras;

import java.util.List;

/**
 *
 * @author miche
 */
public class Vertice{
    private String nome;
    private Vertice predecessor;
    private int low;
    private int initTmpDesc;
    private int finalTmpDesc;
    private Cor cor;
    private List<Vertice> adjacentes;
    private int compConex;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getInitTmpDesc() {
        return initTmpDesc;
    }

    public void setInitTmpDesc(int initTmpDesc) {
        this.initTmpDesc = initTmpDesc;
    }

    public int getFinalTmpDesc() {
        return finalTmpDesc;
    }

    public void setFinalTmpDesc(int finalTmpDesc) {
        this.finalTmpDesc = finalTmpDesc;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public List<Vertice> getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(List<Vertice> adjacentes) {
        this.adjacentes = adjacentes;
    }


    public Vertice() {
        this.cor = Cor.Branco;
    }

    public Vertice getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertice predecessor) {
        this.predecessor = predecessor;
    }

    public int getCompConex() {
        return compConex;
    }

    public void setCompConex(int compConex) {
        this.compConex = compConex;
    }
    
    public boolean verificaAdjavence(Vertice v1, Vertice v2){
        int verificaNome = 0;
        for(int i = 0; i < 5; i++){
            if(v1.getNome().indexOf(i) == v2.getNome().indexOf(i)){
                verificaNome += 1;
            }
        }
        return verificaNome == 5;
    }
}
