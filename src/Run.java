/**
 * @author Dzmitry Fursevich
 */
public class Run {
    public static void main(String[] args) {
        int a = 0;

        while (a < 10) {
            System.out.println("a=" + a);
//            a++;
            a = a + 1;
        }

        int b = 0;
        do {
            System.out.println("b = " + b);
            b++;
        } while (b < 10);
    }
}
