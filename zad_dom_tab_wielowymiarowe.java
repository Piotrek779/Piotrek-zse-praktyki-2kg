package lista;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class zad_dom_tab_wielowymiarowe {
    public static void main(String[] args) {
        //zadanie lista
        ArrayList<String> lista_gier=new ArrayList<>();
        lista_gier.add("Cyberpunk 2077");
        lista_gier.add("GTA V");
        lista_gier.add("Dying light");
        lista_gier.add("Minecraft");
        System.out.println(lista_gier);

        lista_gier.add("Payday 2");
        System.out.println("\n\t"+lista_gier);

        lista_gier.add(1,"GTA San Andreas");
        System.out.println("\n\t"+lista_gier);

        lista_gier.remove("Minecraft");
        lista_gier.remove(2);
        System.out.println("\n\t"+lista_gier);

        lista_gier.set(0,"among us");
        System.out.println("\n\t"+lista_gier);

        Collections.sort(lista_gier);
        System.out.println("\n\t"+lista_gier);

        lista_gier.clear();
        System.out.println("\n\t"+lista_gier);

        //zadania do tablic 1

         int[][] array2 = new int[5][5];
         int value = 0;
         for (int i = 0; i < 5; i++){
           for (int j = 0; j < 5; j++){
               array2[i][j] = value;
                value = value + 5;
               System.out.print(array2[i][j] + "\t");
           }
           System.out.println();
       }

        //zadania do tablic 2
        System.out.println("\n\n");

         int[][][][] array4 = new int[3][3][3][3];
         int value2 = 0;
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 for (int n = 0; n < 3; n++) {
                     for (int l = 0; l < 3; l++) {
                         array4[i][j][n][l] = value2;
                         value2 += 3;
                         System.out.print("[" + i + "][" + j + "][" + n + "][" + l + "] =" + array4[i][j][n][l] + "\t\t");
                     }
                     System.out.println();
                 }
                 System.out.println();
             }
             System.out.println();
         }
    }
}
