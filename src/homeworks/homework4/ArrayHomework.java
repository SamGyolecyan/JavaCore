package homeworks.homework4;

public class ArrayHomework {

    void arrayHomeSim1() {

        // 1. Ունենք թվերի մասիվ, մեջը խառը 10 թիվ։ Ունենք int n = 6; Պետք է հաշվել,
        // թե քանի հատ n փոփոխականից կա մեր թվերի մեջ, ու տպել քանակը։ Եթե չկա՝ 0.


        int[] array1 = {1, 6, 2, 0, 32, 6, 7, 8, 90, 21};

        int n = 6;

        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == n) {
                count++;
            }
        }

        System.out.println("The count of array: " + count);

    }


    void arrayHomeSim2() {

        // 2. Ունենք թվերի մասիվ, մեջը խառը 10 թիվ,
        // գրել ծրագիր, որը էդ մասիվի մեջի թվերը թարս կդասավորի։


        int[] array2 = {3, 9, 2, 1, 71, 4, 2, 12, 43, 98};

        int[] ArrayReverse = new int[10];

        for (int i = array2.length; i > 0; i--) {
            for (int j = 0; j < ArrayReverse.length; j++) {
                ArrayReverse[j] = array2[i - 1];
                System.out.println("j: " + ArrayReverse[j]);
                break;
            }
        }


    }


    void arrayHomeSim3() {

        // 3.Ունենք թվերի մասիվ, մեջը խառը 10 թիվ,
        // գրել ծրագիր, որը էդ մասիվի մեջ կհաշվի թե քանի կրկնվող թիվ կա։


        int[] array3 = {19, 60, 19, 55, 97, 10, 19, 1, 8, 2};

        int NewCount = 0;

        int number = array3[0];

        for (int i = 0; i < array3.length; i++) {

            if (array3[i] != number) {
                System.out.println("i: " + array3[i]);
            } else {
                NewCount++;
            }

        }

        System.out.println("New count: " + NewCount);

    }

    void arrayHomeSim4() {


        // 4. Ունենք char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'} կամ
        // նմանատիպ ցանկացած մասիվ, որտեղ կլինեն հայերեն սինվոլները։ Պետք է ստուգել,
        // թե քանի ձայնավոր կա այս մասիվի մեջ, ու տպել քանակը։


        String[] letters = {"բ", "ա", "ր", "և", "ա", "շ", "խ", "ա", "ր", "հ"};

        String[] vowels = {"ա", "ի", "ու", "է", "ը", "օ"};

        int count = 0;

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == letters[i]) {
                    count++;
                }
            }
        }
        System.out.println("The count of vowels: " + count);

    }


}
