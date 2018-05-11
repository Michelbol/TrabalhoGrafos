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
public class Algoritmos {
    
    
    public boolean identificaCompConexos(Grafo g){
        g.setAllVerticeBranco();
        int compConex = 0;
        for(Vertice vertice : g.getVertice()){
            if(vertice.getCor() == Cor.Branco){
                compConex += 1;
                buscaEmProfundidadeConex(vertice, compConex);
            }
        }
        for(int i = 0; i <= compConex; i++){
            int nroVertices = 0;
            for(Vertice vertice : g.getVertice()){
                if(vertice.getCompConex() == i){
                    nroVertices += 1;
                }
                if(nroVertices >= 2){
                    break;
                }
            }
            if(nroVertices == 1){
                return false;
            }
        }
        return true;
    }
    
    public void buscaEmProfundidadeConex(Vertice v, int compConex){
        v.setCor(Cor.Cinza);
        v.setCompConex(compConex);
        for(Vertice vertice : v.getAdjacentes()){
            if (vertice.getCor() == Cor.Branco){
                buscaEmProfundidadeConex(vertice, compConex);
            }
        }
        v.setCor(Cor.Preto);
    }
    
    
    public boolean buscaEmProfundidade(){
        return true;
    }
    
    public void buscaEmLargura(Grafo g,Vertice s){
        List<Vertice> filaVertice = new ArrayList();
        Vertice u;
        
        g.initForBuscaLargura(s);
        
        filaVertice.add(s);
        while (!filaVertice.isEmpty()){
            u = filaVertice.remove(0);
            
            for (Vertice v : g.getVertice()){
                if(u.getAdjacentes().contains(v)){
                    if (v.getCor().equals(Cor.Branco)){
                        v.setCor(Cor.Cinza);
                        v.setDistancia(u.getDistancia() + 1);
                        v.setPredecessor(u);
                        filaVertice.add(v);
                    }
                }
            }
            u.setCor(Cor.Preto);
        }
    }
    
    public boolean isPontoArticulacao(Vertice u, int tempo){
        tempo += 1;
        u.setCor(Cor.Cinza);
        u.setLow(tempo);
        u.setInitTmpDesc(tempo);
        
        for (Vertice v : u.getAdjacentes()){
            if (v.getCor().equals(Cor.Branco)){
                v.setPredecessor(u);
                isPontoArticulacao(v,tempo);
                if (u.getPredecessor()==null){
                    if(isSegundoFilho(u,v)) return true;
                } else {
                    u.setLow(Integer.min(u.getLow(),v.getLow()));
                    if (v.getLow() >= u.getInitTmpDesc()) return true;
                }
            } else {
                if (v!=u.getPredecessor() && v.getInitTmpDesc() < u.getInitTmpDesc()) u.setLow(Integer.min(u.getLow(),v.getInitTmpDesc()));
            }
        }
        
        u.setCor(Cor.Preto);
        tempo += 1;
        u.setFinalTmpDesc(tempo);
        return true;
    }
    
    public boolean isSegundoFilho(Vertice u, Vertice v){
        return u == v.getPredecessor().getPredecessor();
    }
    
    public boolean isPonte(int tempo, Vertice v){
        tempo += 1;
        v.setCor(Cor.Cinza);
        v.setInitTmpDesc(tempo);
        v.setLow(v.getInitTmpDesc());
        for(Vertice verticeAdjacente: v.getAdjacentes()){
            if(verticeAdjacente.getCor() == Cor.Branco){
                verticeAdjacente.setPredecessor(v); 
                isPonte(tempo, verticeAdjacente);
                v.setLow(Integer.min(v.getLow(), verticeAdjacente.getLow()));
                if(verticeAdjacente.getLow() > v.getInitTmpDesc()){
                    return true;
                }else{
                    if((verticeAdjacente != v.getPredecessor()) && (verticeAdjacente.getInitTmpDesc() < v.getInitTmpDesc())){
                       v.setLow(Integer.min(v.getLow(), verticeAdjacente.getInitTmpDesc()));
                    }
                }
            }
        }
        v.setCor(Cor.Preto);
        tempo += 1;
        v.setFinalTmpDesc(tempo);
        return false;
    }
}
