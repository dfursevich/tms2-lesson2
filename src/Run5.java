/**
 * @author Dzmitry Fursevich
 */
public class Run5 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 4) {

            sum = sum + a;

            a = a * 2;
        }
        System.out.println("sum = " + sum);
    }
}
