/**
 * @author Dzmitry Fursevich
 */
public class Run3 {
    public static void main(String[] args) {
        int time = 0;
        int count = 0;
        while (time <= 24) {
            if (time == 0) {
                count = 1;
            } else {
                count = count * 2;
            }

            System.out.println("time: " + time + ",count = " + count);

            time = time + 3;
        }
    }
}
