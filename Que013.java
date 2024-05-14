public class Que013 {
    public static void main(String[] args) {
        int result = 0;
        int x = 1;

        while (result < 100) {
            result = (x * (x + 1)) / 2;
            x++;
            if (result <= 100) {
                System.out.print(result + " ");

            }

        }
    }
}
