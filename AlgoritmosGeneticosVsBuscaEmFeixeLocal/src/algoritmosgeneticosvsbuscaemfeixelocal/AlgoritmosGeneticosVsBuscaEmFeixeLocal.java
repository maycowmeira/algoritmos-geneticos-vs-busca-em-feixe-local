package algoritmosgeneticosvsbuscaemfeixelocal;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlgoritmosGeneticosVsBuscaEmFeixeLocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int[][] matrizCidades = null;
        //try catch para caso o programa não encontrar o arquivo com a matriz
        try {
            matrizCidades = Util.lerArquivo();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AlgoritmosGeneticosVsBuscaEmFeixeLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Util.imprimirMatrizCidades(matrizCidades);
       
    }
}
