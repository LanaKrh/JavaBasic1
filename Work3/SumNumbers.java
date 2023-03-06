package Work3;

public class SumNumbers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 20; i <= 60; i++) {
            if (i % 2 != 0) {
                sum += i;

                System.out.println("Сумма всех нечетных чисел от 20 до 60 включительно: " + sum);
            }
        }
    }
}
