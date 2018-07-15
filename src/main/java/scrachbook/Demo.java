package scrachbook;

public class Demo {
    public static void main(String[] args) {

        int [][] tab1 = new int [2][3];
        int [][] tab2 = new int [3][2];

        tab1 [0][0] = 4;
        tab1 [0][1] = 5;
        tab1 [0][2] = 6;

        tab1 [1][0] = 7;
        tab1 [1][1] = 8;
        tab1 [1][2] = 9;

        tab2 [0][0] = 4;
        tab2 [0][1] = 5;

        tab2 [1][0] = 6;
        tab2 [1][1] = 7;

        tab2 [2][0] = 8;
        tab2 [2][1] = 9;

        System.out.println("=-=-=-=-=-=-=-=-=");

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                System.out.print(tab1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("=-=-=-=-=-=-=-=-=");

        for (int a = 0;a < tab2.length; a++) {
            for (int b = 0; b < tab2[a].length; b++) {
                System.out.print(tab2[a][b] + "\t");
            }
            System.out.println();
        }

        System.out.println("=-=-=-=-=-=-=-=-=");

    }
}
