//Bubble Sort
package Principal;

import java.util.Scanner;

public class estudosJava {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[][] bubble = new double[5][5];
        //Ordenador Bubble Sort
        double bubbleAux;

        //Populando Matriz
        for (int i = 0; i < bubble.length; i++) {
            System.out.println("Número: " + (i + 1));
            bubble[i][i] = leitor.nextInt();
        }

        //Ordenando Valores Designados
        for (int i = 0; i < bubble.length; i++) {
            for (int j = 0; j < bubble.length; j++) {
                if (bubble[j][j] > bubble[i][i]) {
                    bubbleAux = bubble[i][i];
                    bubble[i][i] = bubble[j][j];
                    bubble[j][j] = bubbleAux;
                }
            }
        }

    };
};
