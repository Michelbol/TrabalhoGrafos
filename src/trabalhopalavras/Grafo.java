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
public class Grafo{
    private List<Aresta> aresta;
    private List<Vertice> vertice;

    public List<Aresta> getAresta() {
        return aresta;
    }

    public void setAresta(List<Aresta> aresta) {
        this.aresta = aresta;
    }

    public List<Vertice> getVertice() {
        return vertice;
    }

    public void setVertice(List<Vertice> vertice) {
        this.vertice = vertice;
    }
    
    public int distanciaEntreVertices(Vertice v1, Vertice v2){
        return 999;
    }
    
    public void setAllVerticeBranco(){
        for(Vertice v: this.vertice){
            v.setCor(Cor.Branco);
        }
    }
    public void setAllCompConexZero(){
        for(Vertice v: this.vertice){
            v.setCompConex(0);
        }
    }
    
    public void addAresta(Aresta aresta){
        List arestas = this.getAresta();
        arestas.add(aresta);
        this.setAresta(arestas);
    }
    public void addVertice(Vertice vertice){
        List vertices = this.getVertice();
        vertices.add(vertice);
        this.setVertice(vertices);
    }

    public Grafo() {
        List<Vertice> v = new ArrayList();
        List<Aresta> a = new ArrayList();
        this.setAresta(a);
        this.setVertice(v);
    }

    @Override
    public String toString() {
        return "Grafo{" + "aresta=" + aresta + ", vertice=" + vertice + '}';
    }
    
    public void initForBuscaLargura(Vertice s){
        for(Vertice v: this.vertice){
            v.setCor(Cor.Branco);
            v.setDistancia(Integer.MAX_VALUE);
            v.setPredecessor(null);
            if (v.equals(s)){
                s.setCor(Cor.Cinza);
                s.setDistancia(0);
            }
        }
    }
    
    public List<Aresta> pontes(Grafo g){
        List<Aresta> pontes = new ArrayList();
        for(Vertice v : g.getVertice()){
            Aresta a = Algoritmos.isPonte(0, v);
            if(a != null){
                pontes.add(a);
            }
        }
        return pontes;
    }
    
    public List<Vertice> pontosDeArticulacao(Grafo g){
        List<Vertice> pontosDeArticulacao = new ArrayList();
        for(Vertice v : g.getVertice()){
            limpaGrafo(g);
            if(Algoritmos.isPontoArticulacao(v, 0)){
                pontosDeArticulacao.add(v);
            }
        }
        return pontosDeArticulacao;
    }
    
    public Grafo limpaGrafo(Grafo g){
        for(Vertice v: g.getVertice()){
            v.setLow(0);
            v.setInitTmpDesc(0);
            v.setFinalTmpDesc(0);
            v.setCor(Cor.Branco);
            v.setCompConex(0);
            v.setDistancia(0);
        }
        return g;
    }
}
