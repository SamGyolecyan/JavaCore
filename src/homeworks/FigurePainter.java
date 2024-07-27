package homeworks;

public class FigurePainter {

    public static void main(String[] args) {

        // 1. Ստանալ հետևյալ պատկերը։

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

        System.out.println("1." + "\n");


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
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


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
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


        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
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


        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 5 - i; k++) {
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


        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }

            System.out.println();
        }


        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 5 - i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }

}
