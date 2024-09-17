package homeworks.homework5;

public class Sort {

    int[] array = new int[10];

    void sortItem() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {

                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }


        }

        for (int x : array) {
            System.out.print(x + " ");
        }

    }


}
