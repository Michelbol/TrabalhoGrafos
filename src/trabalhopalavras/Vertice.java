/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopalavras;

import java.util.ArrayList;
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
    private int distancia;
    private boolean isPontoArticulacao;

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
        List<Vertice> adjacente = new ArrayList();
        this.setAdjacentes(adjacente);
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
//        System.out.println("Comparando: " + v1.getNome()+" com:" + v2.getNome());
        for(int i = 0; i < 5; i++){
//            System.out.println("Comparando: " + v1.getNome().charAt(i)+" com:" + v2.getNome().charAt(i));
            if(v1.getNome().charAt(i) == v2.getNome().charAt(i)){
                verificaNome += 1;
            }
        }
        if(verificaNome >= 4){
//            System.out.println("São adjacentes");
            return true;
        }
//        System.out.println("Não são adjacentes");
        return false;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Vertice{" + "nome=" + nome + '}';
    }
    public void addAdjacente(Vertice v){
        List adjacente = this.getAdjacentes();
        adjacente.add(v);
        this.setAdjacentes(adjacente);
    }

    public boolean isIsPontoArticulacao() {
        return isPontoArticulacao;
    }

    public void setIsPontoArticulacao(boolean isPontoArticulacao) {
        this.isPontoArticulacao = isPontoArticulacao;
    }
    
    
    
}
