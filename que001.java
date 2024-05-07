public class Que001 {

    public static void main(String[] args) {
        System.out.println("ASCII Chart: ");
        for (int i = 0; i < 128; i++) {
            // System.out.println(i + " : " + (char) i);
            System.out.printf("%3d: %c\n", i, i);
        }
    }
}