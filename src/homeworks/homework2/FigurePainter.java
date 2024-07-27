package homeworks.homework2;

public class FigurePainter {


    void figureOne(int n, char c) {


        // 1. Ստանալ հետևյալ պատկերը։

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }


    void figureTwo(int n, char c) {


        // 2. Ստանալ հետևյալ պատկերը։

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }


    void figureThree(int n, char c) {


        // 3. Ստանալ հետևյալ պատկերը։

//                *
//              * *
//            * * *
//          * * * *
//        * * * * *


        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }


    void figureFour(int n, char c) {


        // 4. Ստանալ հետևյալ պատկերը։

//        * * * * *
//          * * * *
//            * * *
//              * *
//                *


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < n - i; k++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }


    void figureFive(int n, char c) {


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


        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print(" " + c);
            }

            System.out.println();
        }


        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
