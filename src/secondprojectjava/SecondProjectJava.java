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
        for(int i = 0; i < masyvas.length; i++){
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
    }

}
