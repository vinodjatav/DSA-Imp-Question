package Medium;

import java.util.Arrays;
import java.util.List;

class Medium1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Medium2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class Medium {
    public static void main(String[] args) {
        // Medium1 md1 = new Medium1();
        // Medium2 md2 = new Medium2();
        // md1.start();
        // md2.start();
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c + e);
        System.out.println(result);
    }

}
