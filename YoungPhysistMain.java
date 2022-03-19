import java.util.Scanner;

public class YoungPhysistMain {
    public static String equilibriumChecker() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x_sum = 0;
        int y_sum = 0;
        int z_sum = 0;
        if (n < 1 || n > 100) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            if ((x >= -100 && x <= 100) && (y >= -100 && y <= 100) && (z >= -100 && z <= 100)) {
                x_sum += x;
                y_sum += y;
                z_sum += z;
            } else {
                return null;
            }
        }
        if (x_sum == 0 && y_sum == 0 && z_sum == 0) {
            return ("yes");
        } else {
            return ("No");
        }
    }
}
