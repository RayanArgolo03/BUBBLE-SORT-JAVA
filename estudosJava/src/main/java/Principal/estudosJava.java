//Bubble Sort
package Principal;

import java.util.Scanner;

public class estudosJava {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] bubble = new int[5];
        
        //Ordenador Bubble Sort
        int bubbleAux;

        //Populando Vetor
        for (int i = 0; i < bubble.length; i++) {
            System.out.println("Número: " + (i + 1));
            bubble[i] = leitor.nextInt();
        }

        //Ordenando Valores Designados
        for (int i = 0; i < bubble.length; i++) {
            for (int j = 0; j < bubble.length; j++) {
                if (bubble[j] > bubble[i]) {
                    bubbleAux = bubble[i];
                    bubble[i] = bubble[j];
                    bubble[j]= bubbleAux;
                }
            }
        }

        //Imprimindo Valores
        for (int i = 0; i < bubble.length; i++) {
            System.out.print("Ordenado: " + bubble[i] + " \n");

        }

    }
;
};
