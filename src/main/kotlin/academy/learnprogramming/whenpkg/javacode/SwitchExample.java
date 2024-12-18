package academy.learnprogramming.whenpkg.javacode;

public class SwitchExample {

    public static void main(String[] args) {

        int num = 200;
        switch (num) {
            case 100 -> System.out.println("100");
            case 200 -> System.out.println("200");
            case 300 -> System.out.println("300");
            default -> System.out.println("default");
        }

        var result = switch (num) {
            case 100 -> {
                System.out.println("From case 100");
                yield 100;
            }
            case 200 -> 200;
            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
    }
}
