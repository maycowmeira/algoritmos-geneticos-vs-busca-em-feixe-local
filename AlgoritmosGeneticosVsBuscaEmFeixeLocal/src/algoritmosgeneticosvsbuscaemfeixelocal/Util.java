package algoritmosgeneticosvsbuscaemfeixelocal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Util {

    public static int[][] lerArquivo() throws FileNotFoundException {
        FileReader file = new FileReader("DistanciaCidades.txt");
        int[][] matrizCidades = new int[15][15];
        try {
            Scanner input = new Scanner(file);
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 15; j++) {
                    matrizCidades[i][j] = input.nextInt();
                }
            }
            input.close();
            return matrizCidades;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void imprimirMatrizCidades(int[][] matrizCidades){
        for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 15; j++) {
                    System.out.print(matrizCidades[i][j] + " ");
                }
                System.out.println("");
            }
    }
}
