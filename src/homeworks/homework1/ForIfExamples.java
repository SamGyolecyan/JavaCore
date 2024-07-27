package homeworks.homework1;

public class ForIfExamples {

    public static void main(String[] args) {


        // 1. Տպեք թվերը 1-ից 10 օգտագործելով for ցիկլը:


        for (int i = 1; i <= 10; i++) {
            System.out.println("i: " + i);
        }

        System.out.println("--------------");

        // 2. Գտեք թվերի գումարը 1-ից 100 օգտագործելով for:


        int sum = 0;

        for (int x = 0; x < 100; x++) {
            sum = sum + x;
        }
        System.out.println("sum: " + sum);

        System.out.println("--------------");

        // 3. Տպեք թվերը 1-ից 50 հակառակ հերթականությամբ օգտագործելով for:


        for (int y = 50; y >= 1; y--) {
            System.out.println("y: " + y);
        }

        System.out.println("--------------");

        // 4. Տպեք բոլոր կենտ թվերը 1-ից 20, առանց օգտագործելու % օպերատորը:


        for (int q = 1; q < 20; q = q + 2) {
            System.out.println("c: " + q);
        }

        System.out.println("--------------");

        // 5. Գտեք 1-ից 100 բոլոր զույգ թվերի քանակը, առանց օգտագործելու % օպերատորը:

        int count = 0;

        for (int c = 0; c < 100; c = c + 2) {
            count++;
        }

        System.out.print("count: " + count);


    }
}
