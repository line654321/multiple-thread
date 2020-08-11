package create;

public class CountDownThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Bắt đầu run thread " + Thread.currentThread().getName());
        int count = 10;
        for (int i = count; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hết giờ");
    }

}
