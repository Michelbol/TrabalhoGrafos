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
}
