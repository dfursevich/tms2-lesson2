/**
 * @author Dzmitry Fursevich
 */
public class Run6 {
    public static void main(String[] args) {
        int day = 1;
        double dayDistance = 0;
        double total = 0;
        while (day <= 7) {
            if (day == 1) {
                dayDistance = 10;
            } else {
                dayDistance = dayDistance * 1.1;
            }
            System.out.println("day:" + day +", dayDistance = " + dayDistance);
            total = total + dayDistance;
            day++;
        }
        System.out.println("total = " + total);
    }
}
