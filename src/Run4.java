/**
 * @author Dzmitry Fursevich
 */
public class Run4 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 99) {
//            if (a % 2 == 1) {
                sum = sum + a;
//            }
            a = a + 2;
        }
        System.out.println("sum = " + sum);
    }
}
