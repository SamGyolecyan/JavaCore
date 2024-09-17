package homeworks.homework1;

public class ForIfExamples {


    void forIfSim1(int n) {


        // 1. Տպեք թվերը 1-ից 10 օգտագործելով for ցիկլը:


        for (int i = 1; i <= n; i++) {
            System.out.println("i: " + i);
        }


    }


    void forIfSim2(int n) {


        // 2. Գտեք թվերի գումարը 1-ից 100 օգտագործելով for:


        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        System.out.println("sum: " + sum);


    }


    void forIfSim3(int n) {


        // 3. Տպեք թվերը 1-ից 50 հակառակ հերթականությամբ օգտագործելով for:


        for (int i = n; i >= 1; i--) {
            System.out.println("y: " + i);
        }


    }


    void forIfSim4(int n) {


        // 4. Տպեք բոլոր կենտ թվերը 1-ից 20, առանց օգտագործելու % օպերատորը:


        for (int i = 1; i < n; i = i + 2) {
            System.out.println("c: " + i);
        }


    }


    void forIfSim5(int n) {


        // 5. Գտեք 1-ից 100 բոլոր զույգ թվերի քանակը, առանց օգտագործելու % օպերատորը:

        int count = 0;

        for (int i = 0; i < n; i = i + 2) {
            count++;
        }

        System.out.print("count: " + count);


    }

}
