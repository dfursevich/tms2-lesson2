/**
 * @author Dzmitry Fursevich
 */
public class Run8 {
    public static void main(String[] args) {
        double money = 100;

        for (int i = 1; i <= 15; i++) {
            if (i % 5 == 0) {
                money = money * 1.16;
            } else {
                money = money * 1.15;
            }
        }

        System.out.println("money = " + money);
    }
}
