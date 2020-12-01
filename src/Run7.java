/**
 * @author Dzmitry Fursevich
 */
public class Run7 {
    public static void main(String[] args) {
        int b = 0;
        while (b < 10) {
            System.out.println("b=" + b);
            b++;
        }

        for (int a = 0; a < 10; a++) {
            System.out.println("a = " + a);
        }

        System.out.println();

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
            System.out.println();
        }
    }
}
