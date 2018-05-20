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
        try{
            //=======================================Exemplo 1============================================================================//
            /**/grafo = lerGrafo(new File(".").getCanonicalPath()+"\\src\\TrabalhoPalavras\\sgb-words.txt");                            /**/
            /**/int nroCompConexos = identificaCompConexos(grafo);                                                                      /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Nro Vertices: "+ grafo.getVertice().size());                                                        /**/
            /**/System.out.println("Nro Arestas: "+ grafo.getAresta().size());                                                          /**/
            /**/System.out.println("Caminho de "+grafo.getVertice().get(3)+" até "+grafo.getVertice().get(5)+" é: "+                    /**/
            /**/Algoritmos.getCaminho(grafo, grafo.getVertice().get(3), grafo.getVertice().get(5)));                                    /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Nro Componentes Conexos: "+ nroCompConexos);                                                        /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("As pontes são: "+ grafo.pontes(grafo));                                                             /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Os pontos de Articulação são: "+ grafo.pontosDeArticulacao(grafo).size());                          /**/
            //=======================================Exemplo 1============================================================================//
        }catch(Exception e){
            System.out.println("Exception: "+ e);
        }
        System.out.println("=============================================================================================================");
        try{
            //=======================================Exemplo 1============================================================================//
            /**/grafo = lerGrafo(new File(".").getCanonicalPath()+"\\src\\TrabalhoPalavras\\exemplo1.txt");                             /**/
            /**/int nroCompConexos = identificaCompConexos(grafo);                                                                      /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Exemplo 1:");                                                                                       /**/
            /**/System.out.println("Nro Vertices: "+ grafo.getVertice().size());                                                        /**/
            /**/System.out.println("Nro Arestas: "+ grafo.getAresta().size());                                                          /**/
            /**/System.out.println("Caminho de "+grafo.getVertice().get(3)+" até "+grafo.getVertice().get(5)+" é: "+                    /**/
            /**/Algoritmos.getCaminho(grafo, grafo.getVertice().get(3), grafo.getVertice().get(5)));                                    /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Nro Componentes Conexos: "+ nroCompConexos);                                                        /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("As pontes são: "+ grafo.pontes(grafo));                                                             /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Os pontos de Articulação são: "+ grafo.pontosDeArticulacao(grafo).size());                          /**/
            /**/System.out.println("Os pontos de Articulação são: "+ grafo.pontosDeArticulacao(grafo).toString());                      /**/
            //=======================================Exemplo 1============================================================================//
        }catch(Exception e){
            System.out.println("Exception: "+ e);
        }
        System.out.println("=============================================================================================================");
        try{
            //=======================================Exemplo 2============================================================================//
            /**/grafo = lerGrafo(new File(".").getCanonicalPath()+"\\src\\TrabalhoPalavras\\exemplo2.txt");                             /**/
            /**/int nroCompConexos = identificaCompConexos(grafo);                                                                      /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Exemplo 2:");                                                                                       /**/
            /**/System.out.println("Nro Vertices: "+ grafo.getVertice().size());                                                        /**/
            /**/System.out.println("Nro Arestas: "+ grafo.getAresta().size());                                                          /**/
            /**/System.out.println("Caminho de "+grafo.getVertice().get(1)+" até "+grafo.getVertice().get(26)+" é: "+                   /**/
            /**/Algoritmos.getCaminho(grafo, grafo.getVertice().get(1), grafo.getVertice().get(26)));                                   /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Nro Componentes Conexos: "+ nroCompConexos);                                                        /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("As pontes são: "+ grafo.pontes(grafo));                                                             /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Os pontos de Articulação são: "+ grafo.pontosDeArticulacao(grafo).size());                          /**/
            //=======================================Exemplo 2============================================================================//
        }catch(Exception e){
            System.out.println("Exception: "+ e);
        }
        System.out.println("=============================================================================================================");
        try{
            //=======================================Exemplo 3============================================================================//
            /**/grafo = lerGrafo(new File(".").getCanonicalPath()+"\\src\\TrabalhoPalavras\\exemplo3.txt");                             /**/
            /**/int nroCompConexos = identificaCompConexos(grafo);                                                                      /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Exemplo 3:");                                                                                       /**/
            /**/System.out.println("Nro Vertices: "+ grafo.getVertice().size());                                                        /**/
            /**/System.out.println("Nro Arestas: "+ grafo.getAresta().size());                                                          /**/
            /**/System.out.println("Caminho de "+grafo.getVertice().get(191)+" até "+grafo.getVertice().get(33)+" é: "+                 /**/
            /**/Algoritmos.getCaminho(grafo, grafo.getVertice().get(191), grafo.getVertice().get(33)));                                 /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Nro Componentes Conexos: "+ nroCompConexos);                                                        /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("As pontes são: "+ grafo.pontes(grafo));                                                             /**/
            /**/grafo.limpaGrafo(grafo);                                                                                                /**/
            /**/System.out.println("Os pontos de Articulação são: "+ grafo.pontosDeArticulacao(grafo).size());                          /**/
            //=======================================Exemplo 3============================================================================//
        }catch(Exception e){
            System.out.println("Exception: "+ e);
        }
    }
    
    
    public static Grafo lerGrafo(String path){
        try {
            Grafo grafo = new Grafo();
            FileReader arq = new FileReader(path);
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
