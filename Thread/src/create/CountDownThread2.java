package create;

public class CountDownThread2 implements Runnable {

    private static int n = 0;

    @Override
    public void run() {
        runable();
    }

    public synchronized void runable(){
        int count = 10;
        for (int i = count; i > 0; i--) {
//            System.out.println();
            System.out.println("Chay tren thread " + Thread.currentThread().getName() + "  " + n++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
