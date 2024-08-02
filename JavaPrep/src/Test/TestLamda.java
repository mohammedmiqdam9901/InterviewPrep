package Test;

public class TestLamda {

    public static void main(String[] args) {

        Calculator addition = (a,b) -> a + b;

        System.out.println(addition.calculation(2,3));
    }
}
