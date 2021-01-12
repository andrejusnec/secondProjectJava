package secondprojectjava;

import java.util.Scanner;

/**
 *
 * @author kilgo
 */
public class SecondProjectJava {
// Surusioti didejimo ir mazejimo tvarka po karta

    public static void main(String[] args) {
        int[] masyvas = {15, 42, 15, 98, -2000, -47, -10, 3, -14, 36, 40, 10};
        System.out.println("Duotas masyvas:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        /**
         * ***************DYDEJIMO TVARKA*****************
         */
        System.out.println("\n************DYDEJIMO TVARKA*************");
        for (int i = 0; i < masyvas.length; i++) {
            for (int x = i + 1; x < masyvas.length; x++) {
                int temporary = 0;
                if (masyvas[i] > masyvas[x]) {
                    temporary = masyvas[i];
                    masyvas[i] = masyvas[x];
                    masyvas[x] = temporary;
                }
            }
            System.out.print(masyvas[i] + " ");
        }
        System.out.println("\n************MAZEJIMO TVARKA*************");
        /**
         * ***************MAZEJIMO TVARKA*****************
         */
        for (int i = 0; i < masyvas.length; i++) {
            for (int x = i + 1; x < masyvas.length; x++) {
                int temporary = 0;
                if (masyvas[i] < masyvas[x]) {
                    temporary = masyvas[i];
                    masyvas[i] = masyvas[x];
                    masyvas[x] = temporary;
                }
            }
            System.out.print(masyvas[i] + " ");
        }
        System.out.println("\n");
        /**
         * ******************************************************************
         */
        System.out.println("********************************************");
        int[] m = {1, 2, 3, 4, 5};
        int[][] rez = new int[m.length][m.length];
        int[] tmp = new int[m.length];
        for (int k = 0; k < m.length; k++) {
            for (int j = 0; j < m.length; j++) {
                rez[k][j] = m[j];
            }
            //*******************************************
            tmp[m.length - 1] = m[0];
            for (int i = 1; i < m.length; i++) {
                tmp[i-1] = m[i];
            }
            for (int i = 0; i < m.length; i++) {
                m[i] = tmp[i];
            }
        }
        //****************************************
        for (int a = 0; a < m.length; a++) {
            for (int b = 0; b < m.length; b++) {
                System.out.print(rez[a][b] + " ");
            }
            System.out.println("");
        }
        System.out.println("********************************************");
    }

}
