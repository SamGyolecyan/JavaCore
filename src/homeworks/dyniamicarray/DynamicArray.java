package homeworks.dyniamicarray;

public class DynamicArray {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    public int[] array = new int[10];

    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    public int size = 0;


    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {

        if (array.length == size) {
            extend();
        }

        array[size++] = value;
    }


    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
    //Եթե չկա նման ինդեքս, տպել որ չկա
    public void add(int index, int value) {

        // Չի ստացվել իմ մոտ ։)

    }


    //ջնջել մասիվի index-երորդ էլեմենտը
    //եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {

        for (int i = 0; i < size; i++) {
            if (index == i) {
                array[index] = 0;
            }
        }

    }


    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
    //Հին արժեքը կկորի
    //եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։
    public void set(int index, int value) {

        if (array.length == size) {
            add(value);
        }

        array[index] = value;

    }


    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    public void extend() {

        int[] newArray = new int[array.length + 10];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }


    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {

        if (index < 0 || index > size) {
            return -1;
        }

        return array[index];
    }


    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false
    public boolean exists(int value) {

        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }


    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
    //եթե չկա, -1
    public int getIndexByValue(int value) {

        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;

    }


    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
