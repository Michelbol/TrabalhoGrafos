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
    
    
    public boolean identificaCompConexos(){
        return true;
    }
    
    public boolean buscaEmProfundidade(){
        return true;
    }
    
    public List<Vertice> buscaEmLargura(){
        List<Vertice> vertice = new ArrayList();
        return vertice;
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
            }
        }
        
        
        return true;
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
