package lab4;

public class task1_5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (RuntimeException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
