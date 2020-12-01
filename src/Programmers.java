/**
 * @author Dzmitry Fursevich
 */
public class Programmers {
    public static void main(String[] args) {
//        int programmers = 110;
        for (int programmers = 0; programmers <300; programmers++) {
            int rest10 = programmers % 10;
            int rest100 = programmers % 100;
            if (rest10 == 0 || (rest10 >= 5 && rest10 <=9) || (rest100 >= 11 && rest100 <=14)) {
                System.out.println(programmers + " программистов");
            } else if (rest10 == 1) {
                System.out.println(programmers + " программист");
            } else {
                System.out.println(programmers + " программиста");
            }
        }
    }
}
