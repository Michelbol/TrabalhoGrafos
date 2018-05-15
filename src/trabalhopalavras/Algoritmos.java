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
    
    
    public static int identificaCompConexos(Grafo g){
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
        }
        return compConex;
    }
    
    public static void buscaEmProfundidadeConex(Vertice v, int compConex){
        v.setCor(Cor.Cinza);
        v.setCompConex(compConex);
        for(Vertice vertice : v.getAdjacentes()){
            if (vertice.getCor() == Cor.Branco){
                buscaEmProfundidadeConex(vertice, compConex);
            }
        }
        v.setCor(Cor.Preto);
    }
    
    public static List<Vertice> getCaminho(Grafo g,Vertice origem,Vertice destino){
        List<Vertice> filaVertice = new ArrayList();
        List<Vertice> listaCaminho = new ArrayList();
        Vertice u;
        Vertice aux;
        
        g.initForBuscaLargura(origem);     
        
        filaVertice.add(origem);
        while (!filaVertice.isEmpty()){
            u = filaVertice.remove(0);
            
            for (Vertice v : u.getAdjacentes()){
                if (v.getCor().equals(Cor.Branco)){
                    v.setCor(Cor.Cinza);
                    v.setDistancia(u.getDistancia() + 1);
                    v.setPredecessor(u);
                    filaVertice.add(v);
                }                                
                if (destino.equals(v)){                    
                    filaVertice.clear();
                    break;
                }
            }
            u.setCor(Cor.Preto);
        }
        
        if (destino.getDistancia()!=Integer.MAX_VALUE){
            aux = destino;
            while(!aux.equals(origem)){
                listaCaminho.add(0, aux);
                aux = aux.getPredecessor();
            }
            listaCaminho.add(0, origem);
        }
        return listaCaminho;
    }
    
    public static boolean isPontoArticulacao(Vertice u, int tempo){
        tempo += 1;
        u.setCor(Cor.Cinza);        
        u.setInitTmpDesc(tempo);
        u.setLow(u.getInitTmpDesc());
        
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
                if (v!=u.getPredecessor() && (v.getInitTmpDesc() < u.getInitTmpDesc())) u.setLow(Integer.min(u.getLow(),v.getInitTmpDesc()));
            }
        }
        
        u.setCor(Cor.Preto);
        tempo += 1;
        u.setFinalTmpDesc(tempo);
        return false;
    }
    
    public static boolean isSegundoFilho(Vertice u, Vertice v){
        return u == v.getPredecessor().getPredecessor();
    }
    
    public static Aresta isPonte(int tempo, Vertice v){
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
                    Aresta a = new Aresta(verticeAdjacente, v);
                    return a;
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
        return null;
    }
}
