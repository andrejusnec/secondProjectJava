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
         * **********************Masyvo elementu perstatymas********************
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
        int[] m1 = {5, 4, 3, 2, 1};
        int[][] rez1 = new int[m1.length][m1.length];
        int[] tmp1 = new int[m1.length];
        for (int k = 0; k < m1.length; k++) {
            for (int j = 0; j < m1.length; j++) {
                rez1[k][j] = m1[j];
            }
            //*******************************************
            tmp1[0] = m1[m1.length - 1]; // 1 
            for (int i = 0; i < m1.length-1; i++) {
                tmp1[i+1] = m1[i];
            }
            for (int i = 0; i < m1.length; i++) {
                m1[i] = tmp1[i];
            }
        }
        //****************************************
        for (int a = 0; a < m1.length; a++) {
            for (int b = 0; b < m1.length; b++) {
                System.out.print(rez1[a][b] + " ");
            }
            System.out.println("");
        }
    }

}
