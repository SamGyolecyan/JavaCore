package homeworks.bracechecker;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.pop() != ')') {
                        System.out.println("Error");
                    }
            }
        }


    }


}
