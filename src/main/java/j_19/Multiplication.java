package j_19;

public class Multiplication {

        void generateMultiplitication(int x, int y) {

            int [][] tab = new int [x+1][y+1];

            for (int i = 1; i <= x ; i++) {

                for (int ii = 1; ii<=y; ii++) {

                    //System.out.print(i * ii + "\t");
                    tab[i][ii] = i * ii;
                }
                //System.out.println();
            }

            for (int i = 1; i < tab.length; i++) {

                for (int j = 1; j < tab[i].length; j++) {
                    System.out.print(tab[i][j] + "\t");
                }
                System.out.println();
            }

        }
}
