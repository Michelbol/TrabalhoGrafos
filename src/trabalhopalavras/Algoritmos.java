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
        
        
        
        return true;
    }
    public boolean isPonte(int tempo, Vertice v){
        tempo += 1;
        v.setCor(Cor.Cinza);
        v.setLow(v.getInitTmpDesc() > tempo ? tempo : v.getInitTmpDesc());
        for(Vertice verticeAdjacente: v.getAdjacentes()){
            if(verticeAdjacente.getCor() == Cor.Branco){
                verticeAdjacente.setPredecessor(v); 
            }
        }
        
        return true;
    }
}
