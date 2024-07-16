package homeworks;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};


        // 1. Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։

        System.out.print("1.   ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


        System.out.println("\n" + "------------");


        // 2. Տպել մասիվի առաջին էլեմենտը։

        System.out.print("2.   ");

        System.out.println(numbers[0]);


        System.out.println("------------");


        // 3. Տպել մասիվի վերջին էլեմենտը։

        System.out.print("3.   ");

        System.out.println(numbers[numbers.length - 1]);


        System.out.println("------------");


        // 4. Տպել մասիվի երկարությունը։

        System.out.print("4.   ");

        System.out.println(numbers.length);


        System.out.println("------------");


        // 5. Տպել մասիվի ամենափոքր թիվը։

        System.out.print("5.   ");

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print(min);

        System.out.println("\n" + "------------");


        // 6. Տպել մասիվի մեջտեղի թիվը, ստուգել որ 2-ից մեծ լինի երկարությունը, եթե փոքր կամ հավասար էղավ,
        // տպեք որ can't print middle values. եթե զույգ է մասիվի մեջի
        // էլեմենտների թիվը, տպեք մեջտեղի երկու էլեմենտները, եթե կենտ է մի հատը։

        System.out.print("6.   ");

        int num = numbers[numbers.length / 2];

        if (num > 2) {
            System.out.print(num + ",");
        } else {
            System.out.println("can't print middle values");
        }


        if (numbers.length % 2 == 0) {
            System.out.println(numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2 + 1]);
        } else {
            System.out.println(num);
        }


        System.out.println("------------");


        // 7. Հաշվել ու տպել մասիվում զույգերի քանակը։

        System.out.print("7.   ");

        int count1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count1++;
            }
        }
        System.out.println(count1);

        System.out.println("------------");


        // 8. Հաշվել ու տպել մասիվում կենտերի քանակը։

        System.out.print("8.   ");

        int count2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count2++;
            }
        }
        System.out.println(count2);

        System.out.println("------------");


        // 9. Տպել մասիվում էլեմենտների գումարը։

        System.out.print("9.   ");

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);

        System.out.println("------------");


        // 10. Տպել մասիվում թվերի միջին թվաբանականը։

        System.out.print("10.  ");

        int sum1 = 0;

        int avg;

        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
        }

        avg = sum1 / numbers.length;

        System.out.println(avg);

    }


}
