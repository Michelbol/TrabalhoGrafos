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
            v.setDistancia(-1);
            v.setPredecessor(null);
            if (v.equals(s)){
                s.setCor(Cor.Cinza);
                s.setDistancia(0);
            }
        }
    }
    
    public List<Vertice> pontes(Grafo g){
        for(Vertice v : g.getVertice()){
            
        }
        return null;
    }
}
