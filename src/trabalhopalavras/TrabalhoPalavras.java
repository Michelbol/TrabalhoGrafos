/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopalavras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static trabalhopalavras.Algoritmos.identificaCompConexos;
/**
 *
 * @author miche
 */
public class TrabalhoPalavras {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]){
        Grafo grafo;
        grafo = lerGrafo();
        int nroCompConexos = identificaCompConexos(grafo);
        grafo.limpaGrafo(grafo);
        System.out.println("Nro Vertices: "+ grafo.getVertice().size());
        System.out.println("Nro Arestas: "+ grafo.getAresta().size());
        System.out.println("Caminho de "+grafo.getVertice().get(2)+" até "+grafo.getVertice().get(151)+" é: "+ 
                Algoritmos.getCaminho(grafo, grafo.getVertice().get(2), grafo.getVertice().get(151)));
        grafo.limpaGrafo(grafo);
        System.out.println("Nro Componentes Conexos: "+ nroCompConexos);
        grafo.limpaGrafo(grafo);
        System.out.println("As pontes são: "+ grafo.pontes(grafo));
        grafo.limpaGrafo(grafo);
        System.out.println("Os pontos de Articulação são: "+ grafo.pontosDeArticulacao(grafo).size());
    }
    
    
    public static Grafo lerGrafo(){
        try {
            Grafo grafo = new Grafo();
            FileReader arq = new FileReader(new File(".").getCanonicalPath()+"\\src\\TrabalhoPalavras\\sgb-words.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            
            while (linha != null) {
            Vertice vertice = new Vertice();
            vertice.setNome(linha);

            for(Vertice v2 : grafo.getVertice()){
                if(v2.verificaAdjavence(vertice, v2)){
                    v2.addAdjacente(vertice);
                    vertice.addAdjacente(v2);
                    Aresta aresta = new Aresta(vertice,v2);
                    grafo.addAresta(aresta);
                }
            }
            grafo.addVertice(vertice);
            linha = lerArq.readLine();
            }
            arq.close();
            return grafo;
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
            return null;
        }
    }
    
    public static Grafo exemplo1(){
        try {
            Grafo grafo = new Grafo();
            FileReader arq = new FileReader(new File(".").getCanonicalPath()+"\\src\\TrabalhoPalavras\\exemplo1.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            
            while (linha != null) {
            Vertice vertice = new Vertice();
            vertice.setNome(linha);

            for(Vertice v2 : grafo.getVertice()){
                if(v2.verificaAdjavence(vertice, v2)){
                    v2.addAdjacente(vertice);
                    vertice.addAdjacente(v2);
                    Aresta aresta = new Aresta(vertice,v2);
                    grafo.addAresta(aresta);
                }
            }
            grafo.addVertice(vertice);
            linha = lerArq.readLine();
            }
            arq.close();
            return grafo;
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
            return null;
        }
    }
}
