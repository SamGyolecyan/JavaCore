package homeworks.homework3;

public class ArrayUtil {

    void arrayUtilSim1() {

        // 1. Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։


        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        System.out.print("1.   ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    void arrayUtilSim2() {

        // 2. Տպել մասիվի առաջին էլեմենտը։


        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        System.out.println(numbers[0]);

    }


    void arrayUtilSim3() {

        // 3. Տպել մասիվի վերջին էլեմենտը։


        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        System.out.println(numbers[numbers.length - 1]);

    }


    void arrayUtilSim4() {

        // 4. Տպել մասիվի երկարությունը։


        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        System.out.println(numbers.length);

    }


    void arrayUtilSim5() {

        // 5. Տպել մասիվի ամենափոքր թիվը։

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print(min);
    }


    void arrayUtilSim6() {

        // 6. Տպել մասիվի մեջտեղի թիվը, ստուգել որ 2-ից մեծ լինի երկարությունը, եթե փոքր կամ հավասար էղավ,
        // տպեք որ can't print middle values. եթե զույգ է մասիվի մեջի
        // էլեմենտների թիվը, տպեք մեջտեղի երկու էլեմենտները, եթե կենտ է մի հատը։


        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        int num = numbers[numbers.length / 2];

        if (numbers.length - 4 > 2) {
            System.out.print(num + ",");
        } else {
            System.out.println("can't print middle values");
        }


        if (numbers.length % 2 == 0) {
            System.out.println(numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2 + 1]);
        } else {
            System.out.println(num);
        }

    }


    void arrayUtilSim7() {

        // 7. Հաշվել ու տպել մասիվում զույգերի քանակը։


        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        int count1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count1++;
            }
        }
        System.out.println(count1);

    }


    void arrayUtilSim8() {

        // 8. Հաշվել ու տպել մասիվում կենտերի քանակը։


        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        int count2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count2++;
            }
        }
        System.out.println(count2);

    }

    void arrayUtilSim9() {

        // 9. Տպել մասիվում էլեմենտների գումարը։


        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }


    void arrayUtilSim10() {

        // 10. Տպել մասիվում թվերի միջին թվաբանականը։


        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        int sum = 0;

        int avg;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        avg = sum / numbers.length;

        System.out.println(avg);

    }


}
