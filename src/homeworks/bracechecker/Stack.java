package homeworks.bracechecker;

public class Stack {

    private int[] array = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == array.length - 1) {
            System.out.print("The stack is full");
        } else {
            array[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.print("The stack is empty");
            return 0;
        } else {
            return array[tos--];
        }
    }


}
