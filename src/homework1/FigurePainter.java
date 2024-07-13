package homework1;

public class FigurePainter {

    public static void main(String[] args) {

        // 1. Ստանալ հետևյալ պատկերը։

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

        System.out.println("1." + "\n");

        int i, j = 0;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        System.out.println("--------------");


        // 2. Ստանալ հետևյալ պատկերը։

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        System.out.println("2." + "\n");

        int a, b = 0;

        for (a = 0; a < 5; a++) {
            for (b = 0; b < 5 - a; b++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("--------------");


        // 3. Ստանալ հետևյալ պատկերը։

//                *
//              * *
//            * * *
//          * * * *
//        * * * * *

        System.out.println("3." + "\n");

        int q, r, t = 0;


        for (q = 1; q <= 5; q++) {
            for (r = 0; r < 5 - q; r++) {
                System.out.print(" ");
            }

            for (t = 0; t < q; t++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("--------------");


        // 4. Ստանալ հետևյալ պատկերը։

//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

        System.out.println("4." + "\n");

        int x, y, z = 0;

        for (x = 0; x <= 5; x++) {
            for (y = 0; y < x + 1; y++) {
                System.out.print(" ");
            }

            for (z = 0; z < 5 - x; z++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("--------------");


        // 5. Ստանալ հետևյալ պատկերը։

//           *
//          * *
//         * * *
//        * * * *
//       * * * * *
//        * * * *
//         * * *
//          * *
//           *

        System.out.println("5." + "\n");

        int o, k, l, m, n, g = 0;

        for (o = 1; o <= 5; o++) {

            for (k = 0; k < 5 - o; k++) {
                System.out.print(" ");
            }

            for (l = 0; l < o; l++) {
                System.out.print(" *");
            }

            System.out.println();
        }


        for (g = 1; g <= 5; g++) {

            for (m = 0; m < g + 1; m++) {
                System.out.print(" ");
            }

            for (n = 0; n < 5 - g; n++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }

}
