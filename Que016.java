import java.util.Scanner;;

public class Que016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int startNum = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int endNum = sc.nextInt();
        int result = 0;

        int x = 1;
        int count = 0;

        while (result < endNum) {
            result = (x * (x + 1)) / 2;
            x++;
            if (result <= endNum && result >= startNum) {
                System.out.print(result + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count + " numbers are found between " + startNum + " and " + endNum);
        sc.close();
    }
}
