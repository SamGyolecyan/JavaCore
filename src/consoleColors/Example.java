package consoleColors;

public class Example implements ChangeColor, ChangeBack {

    public static void main(String[] args) {

        System.out.println(ANSI_RED + "Hello world" + ANSI_RESET);
        System.out.println("Hello world" + ANSI_RESET);
        System.out.println(ANSI_RED_BACKGROUND + "Samvel");


    }
}
