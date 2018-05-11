/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopalavras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author miche
 */
public class TrabalhoPalavras {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]){
    	 Scanner ler = new Scanner(System.in);
 
//        System.out.printf("Informe o nome de arquivo texto:\n");
//        String nome = ler.nextLine();

        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
          Grafo grafo = new Grafo();
          FileReader arq = new FileReader("C:\\Users\\miche\\Google Drive\\Facul\\Terceiro Ano\\Algoritmos em Grafos\\Trabalho\\TrabalhoPalavras\\src\\trabalhopalavras\\sgb-words.txt");
          BufferedReader lerArq = new BufferedReader(arq);

          String linha = lerArq.readLine(); // lê a primeira linha
    // a variável "linha" recebe o valor "null" quando o processo
    // de repetição atingir o final do arquivo texto
          while (linha != null) {
            Vertice vertice = new Vertice();
            List<Vertice> listaVertice = new ArrayList();
            vertice.setNome(linha);
            listaVertice.add(vertice);  
            for(Vertice v2 : grafo.getVertice()){
                if(v2.verificaAdjavence(v2, vertice)){
                    List adjacentesv2 = new ArrayList();
                    List adjacentesVertice = new ArrayList();
                    adjacentesv2.add(vertice);
                    adjacentesVertice.add(v2);
                    v2.setAdjacentes(adjacentesv2);
                    vertice.setAdjacentes(adjacentesVertice);
                }
            }
            linha = lerArq.readLine(); // lê da segunda até a última linha
          }

          arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
              e.getMessage());
        }

        System.out.println();
    }
}
